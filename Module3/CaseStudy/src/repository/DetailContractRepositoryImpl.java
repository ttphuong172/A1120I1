package repository;

import model.AttachService;
import model.Contract;
import model.Customer;
import model.DetailContract;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DetailContractRepositoryImpl implements DetailContractRepository {
    @Override
    public List<DetailContract> selectAllDetailContract() {
        Connection connection=DBConnection.getConnection();
        CallableStatement callableStatement=null;
        ResultSet resultSet=null;
        List<DetailContract> detailContractList= new ArrayList<>();
        try {
            callableStatement= connection.prepareCall("call selectAllDetailContract");
            resultSet=callableStatement.executeQuery();
            while (resultSet.next()){
                int detailContractId=resultSet.getInt("detailcontractid");
                String attachServiceId=resultSet.getString("attachserviceid");
                String attachServiceName=resultSet.getString("attachservicename");
                AttachService attachService=new AttachService(attachServiceId,attachServiceName);
                int contractId=resultSet.getInt("contractid");
                String customerId=resultSet.getString("customerid");
                String customerName=resultSet.getString("customername");
                Customer customer=new Customer(customerId,customerName);
                Contract contract=new Contract(contractId,customer);
                int quantity=resultSet.getInt("quantity");
                DetailContract detailContract=new DetailContract(detailContractId,attachService,contract,quantity);
                detailContractList.add(detailContract);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detailContractList;
    }

    @Override
    public DetailContract findDetailContractById(int detailContractId) {
        Connection connection=DBConnection.getConnection();
        CallableStatement callableStatement=null;
        ResultSet resultSet=null;
        DetailContract detailContract=null;
        try {
            callableStatement=connection.prepareCall("call findDetailContractById(?)");
            callableStatement.setInt(1,detailContractId);
            resultSet=callableStatement.executeQuery();
            while (resultSet.next()){
                String attachServiceId=resultSet.getString("attachserviceid");
                String attachServiceName=resultSet.getString("attachservicename");
                AttachService attachService=new AttachService(attachServiceId,attachServiceName);
                int contractId=resultSet.getInt("contractid");
                String customerId=resultSet.getString("customerid");
                String customerName=resultSet.getString("customername");
                Customer customer=new Customer(customerId,customerName);
                Contract contract=new Contract(contractId,customer);
                int quantity=resultSet.getInt("quantity");
                detailContract=new DetailContract(detailContractId,attachService,contract,quantity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                callableStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return detailContract;
    }

    @Override
    public void updateDetailContract(int detailContractId, DetailContract detailContract) {
        Connection connection=DBConnection.getConnection();
        CallableStatement callableStatement=null;

        try {
            callableStatement=connection.prepareCall("call updateDetailContract(?,?,?,?)");
            callableStatement.setString(1,detailContract.getAttachService().getAttachServiceId());
            callableStatement.setInt(2,detailContract.getContract().getContractId());
            callableStatement.setInt(3,detailContract.getQuantity());
            callableStatement.setInt(4, detailContractId);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                callableStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
    }

    @Override
    public void saveDetailContract(DetailContract detailContract) {
        Connection connection =DBConnection.getConnection();
        CallableStatement callableStatement=null;
        try {
            callableStatement=connection.prepareCall("call saveDetailContract(?,?,?)");
            callableStatement.setString(1,detailContract.getAttachService().getAttachServiceId());
            callableStatement.setInt(2,detailContract.getContract().getContractId());
            callableStatement.setInt(3,detailContract.getQuantity());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                callableStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
    }

    @Override
    public void removeDetailContract(int detailContractId) {
        Connection connection = DBConnection.getConnection();
        CallableStatement callableStatement=null;

        try {
            callableStatement=connection.prepareCall("call removeDetailContract(?)");
            callableStatement.setInt(1,detailContractId);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                callableStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
    }
}

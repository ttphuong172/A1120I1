package repository;

import model.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceTypeRepositoryImpl implements ServiceTypeRepository {
    @Override
    public List<ServiceType> selectAllServiceType() {
        List<ServiceType> serviceTypeList=new ArrayList<>();
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement=connection.prepareStatement("select * from servicetype");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String serviceTypeId=resultSet.getString("servicetypeid");
                String serviceTypeName=resultSet.getString("servicetypename");
                ServiceType serviceType=new ServiceType(serviceTypeId,serviceTypeName);
                serviceTypeList.add(serviceType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return serviceTypeList;
    }

    @Override
    public ServiceType findServiceTypeById(String serviceTypeId) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        ServiceType serviceType=null;

        try {
            preparedStatement=connection.prepareStatement("select * from servicetype where serviceTypeId=?");
            preparedStatement.setString(1,serviceTypeId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String serviceTypeName=resultSet.getString("servicetypename");
                serviceType=new ServiceType(serviceTypeId,serviceTypeName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return serviceType;
    }
}

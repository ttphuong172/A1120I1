package repository;

import model.AttachService;
import model.Contract;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AttachServiceRepositoryImpl implements AttachServiceRepository {
    @Override
    public List<AttachService> selectAllAttachService() {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<AttachService> attachServiceList = new ArrayList<>();
        try {
            preparedStatement=connection.prepareStatement("select * from attachservices");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
               String attachServiceId= resultSet.getString("AttachServiceId");
                String attachServiceName=   resultSet.getString("AttachServiceName");
                AttachService attachService=new AttachService(attachServiceId,attachServiceName);
                attachServiceList.add(attachService);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachServiceList;
    }


}

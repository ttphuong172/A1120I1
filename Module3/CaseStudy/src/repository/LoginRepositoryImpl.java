package repository;

import java.sql.*;

public class LoginRepositoryImpl implements LoginRepository {
    @Override
    public int getEmployeeId(String username, String password) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        int employeeId=0;

        try {
            preparedStatement=connection.prepareStatement("select employeeId from users where username = ? and password =?");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                employeeId=resultSet.getInt("employeeId");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeId;
    }
}

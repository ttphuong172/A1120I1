package repository;

import model.Login;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginRepositoryImpl implements LoginRepository {
    @Override
    public User checkLogin(Login login) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<>();
        User user = null;
        try {
            preparedStatement = connection.prepareStatement("select * from user");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String account = resultSet.getString("account");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("age");
                user = new User(account, password, name, email, age);
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            DBConnection.close();

        }
        for (User u : userList) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
            }

        }
        return null;
    }
}




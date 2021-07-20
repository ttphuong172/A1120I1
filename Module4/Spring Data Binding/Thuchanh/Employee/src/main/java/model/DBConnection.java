package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DBConnection {

    private static String jdbcURL = "jdbc:mysql://localhost:3306/skl?useSSL=false";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "PhongTran@123";

    public static Connection connection;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.getMessage();
        }
        return connection;
    }
    public static void close(){
        try {
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {

            e.getMessage();
        }
    }

}

package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DBConnection {

    private static String jdbcURL = "jdbc:sqlserver://<server>:<port>;databaseName=AdventureWorks";
    private static String jdbcUsername = "skyline";
    private static String jdbcPassword = "abc123";
    private static String connectionUrl = "jdbc:sqlserver://103.15.50.194:1433;databaseName=skyline_mobile_production;user=skyline;password=abc123";

    public static Connection connection;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
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

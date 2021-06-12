package repository;

import model.ProductType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductTypeRepositoryImpl implements ProductTypeRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "PhongTran@123";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<ProductType> selectAllProductType() {
        List<ProductType> productTypeList=new ArrayList<>();
        try (Connection connection = getConnection() ) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from producttype");
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            //Chuyen tu ResulSet sang List
            while (resultSet.next()) {
                int productTypeId = resultSet.getInt("producttypeid");
                String productTypeName = resultSet.getString("producttypename");
                ProductType productType=new ProductType(productTypeId,productTypeName);
                productTypeList.add(productType);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return productTypeList;
    }
    }

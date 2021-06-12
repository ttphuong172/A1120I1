package repository;

import model.Product;
import model.ProductType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

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
    public List<Product> selectAllProduct() {
        List<Product> productList = new ArrayList<>();
        //Thiết lập connection
        try (Connection connection = getConnection()) {
            //Tao statement
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            System.out.println(preparedStatement);
            //Thuc thi query
            ResultSet resultSet = preparedStatement.executeQuery();
            //Chuyen tu ResultSet sang List
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int productType = resultSet.getInt("producttypeid");

                Product product = new Product(id, name, price,productType);
                productList.add(product);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }

        return productList;
    }



    @Override
    public void save(Product product) {
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into product values (?,?,?,?)");
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getPrice());
            preparedStatement.setInt(4, product.getProductType());
            preparedStatement.executeUpdate();
            System.out.println(preparedStatement);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product where id=?");
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int productType = resultSet.getInt("producttypeid");
                product = new Product(id, name, price,productType);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return product;
    }

    @Override
    public void update(int id, Product product) {
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("update product set name=?,price=? where id=? ");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void remove(int id) {
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from product where id=?");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

//    @Override
//    public List<Product> findAll() {
//        return productList;
//    }
//
//    @Override
//    public void save(Product product) {
//        productList.add(product);
//    }
//
//    @Override
//    public Product findById(int id) {
//        for(int i=0;i<productList.size();i++){
//            if(productList.get(i).getId()==id){
//                return productList.get(i);
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void update(int id, Product product) {
//        for(int i=0;i<productList.size();i++){
//            if(productList.get(i).getId()==id){
//                productList.set(i,product);
//            }
//        }
//    }
//
//    @Override
//    public void remove(int id) {
//        for(int i=0;i<productList.size();i++){
//            if(productList.get(i).getId()==id){
//                productList.remove(i);
//            }
//        }
//    }
}

package repository;

import model.Product;
import model.ProductType;
import servive.ProductTypeService;
import servive.ProductTypeServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    //    private static List<Product> productList;
//    static {
//        productList=new ArrayList<>();
//        productList.add(new Product(1,"OMO",25000));
//        productList.add(new Product(2,"ABA",20000));
//    }
    ProductTypeService productTypeService=new ProductTypeServiceImpl();

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
                int productTypeId = resultSet.getInt("producttypeid");
                //ProductType productType=new ProductType(1,"Thuc pham");

                ProductType productType=productTypeService.findProductTypeById(productTypeId);

                //Product product = new Product(id, name, price,productTypeId);
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
            preparedStatement.setInt(4, product.getProductType().getProductTypeId());
            preparedStatement.executeUpdate();

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
                int productTypeId = resultSet.getInt("producttypeid");
                ProductType productType=productTypeService.findProductTypeById(productTypeId);
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
            PreparedStatement preparedStatement = connection.prepareStatement("update product set name=?,price=?,producttypeid=? where id=? ");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, product.getProductType().getProductTypeId());
            preparedStatement.setInt(4, id);
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

}

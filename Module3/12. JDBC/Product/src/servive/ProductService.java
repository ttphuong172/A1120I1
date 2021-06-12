package servive;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> selectAllProduct();
//    List<Product> findAll();
    String save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove (int id);
}

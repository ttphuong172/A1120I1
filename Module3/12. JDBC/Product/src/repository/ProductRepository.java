package repository;

import model.Product;
import model.ProductType;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

public interface ProductRepository {
    List<Product> selectAllProduct();
    void save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
}

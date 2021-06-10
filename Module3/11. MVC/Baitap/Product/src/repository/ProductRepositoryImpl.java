package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private static List<Product> productList;
    static {
        productList=new ArrayList<>();
        productList.add(new Product(1,"OMO",25000));
        productList.add(new Product(2,"ABA",20000));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for(int i=0;i<productList.size();i++){
            if(productList.get(i).getId()==id){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        for(int i=0;i<productList.size();i++){
            if(productList.get(i).getId()==id){
                productList.set(i,product);
            }
        }
    }

    @Override
    public void remove(int id) {
        for(int i=0;i<productList.size();i++){
            if(productList.get(i).getId()==id){
                productList.remove(i);
            }
        }
    }
}

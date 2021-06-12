package servive;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import model.Product;
import org.w3c.dom.ls.LSOutput;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;


public class ProductServiceImpl implements ProductService {
    private ProductRepository repository=new ProductRepositoryImpl();


    public boolean  checkPrice(Product product){
        if (product.getPrice()>100000){
            System.out.println("LOI");
            return false;
        }
        return true;
    }

    @Override
    public List<Product> selectAllProduct() {
        return repository.selectAllProduct();
    }

    @Override
    public String save(Product product) {
        String message="";
       if (checkPrice(product)){
           repository.save(product);
         return message ="Thanh cong";
       }
       return message ="That bai";
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        repository.update(id, product);
    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }



//    @Override
//    public List<Product> findAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public void save(Product product) {
//        repository.save(product);
//    }
//
//    @Override
//    public Product findById(int id) {
//        return repository.findById(id);
//    }
//
//    @Override
//    public void update(int id, Product product) {
//        repository.update(id, product);
//    }
//
//    @Override
//    public void remove(int id) {
//        repository.remove(id);
//    }
}

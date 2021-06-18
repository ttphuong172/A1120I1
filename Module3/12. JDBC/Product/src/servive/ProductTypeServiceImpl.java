package servive;

import model.ProductType;
import repository.ProductTypeRepository;
import repository.ProductTypeRepositoryImpl;

import java.util.List;

public class ProductTypeServiceImpl implements ProductTypeService {
    ProductTypeRepository repository=new ProductTypeRepositoryImpl();

    @Override
    public List<ProductType> selectAllProductType() {
        return repository.selectAllProductType();
    }

    @Override
    public ProductType findProductTypeById(int producttypeid) {
        return repository.findProductTypeById(producttypeid);
    }
}

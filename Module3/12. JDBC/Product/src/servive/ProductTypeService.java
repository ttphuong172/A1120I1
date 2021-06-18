package servive;

import model.ProductType;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> selectAllProductType();
    ProductType findProductTypeById(int producttypeid);

}

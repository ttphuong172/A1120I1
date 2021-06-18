package repository;

import model.ProductType;

import java.util.List;

public interface ProductTypeRepository {
    List<ProductType> selectAllProductType();
    ProductType findProductTypeById(int producttypeid);
}

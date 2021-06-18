package model;

public class Product {
    private int id;
    private String name;
    private int price;
    //private int productTypeId;
    private ProductType productType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
//    public int getProductTypeId() {
//        return productTypeId;
//    }
//
//    public void setProductTypeId(int productTypeId) {
//        this.productTypeId = productTypeId;
//    }

    public Product(int id, String name, int price, ProductType productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        //this.productTypeId = productTypeId;
        this.productType=productType;
    }
}

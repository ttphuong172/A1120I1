package model;

public class Product {
    private int id;
    private String name;
    private int price;
    private int productType;

    public Product(int id, String name, int price,int productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = productType;

    }

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

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }
}

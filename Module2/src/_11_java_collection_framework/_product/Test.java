package _11_java_collection_framework._product;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager1 = new ProductManager();
        Product product1 = new Product(1, "xa phong", 2000);
        Product product2 = new Product(1, "bot giat", 300);
        Product product3 = new Product(3, "dau goi", 400);
        Product product4 = new Product(4, "dau goi", 500);
        productManager1.addProduct(product1);
        productManager1.addProduct(product3);
        productManager1.addProduct(product4);
        productManager1.editProduct(1, product2);

        System.out.println();
        System.out.println("Tim kiem");
        productManager1.searchProduct("dau goi");
        //System.out.println(productManager1.listProduct);
        System.out.println("Sap xep tang dan");
        productManager1.sortPriceAscending();
        System.out.println("Sap xep giam dan");
        productManager1.sortPriceDecrease();

    }
}

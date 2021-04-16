package _11_java_collection_framework._product;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager1 = new ProductManager();
        Product product1 = new Product(1, "aba", 300);
        Product product2 = new Product(2, "bot giat", 300);
        Product product3 = new Product(3, "a dau goi", 300);
        Product product4 = new Product(4, "a au goi", 300);

        productManager1.addProduct(product1);
        productManager1.addProduct(product2);
        productManager1.addProduct(product3);
        productManager1.addProduct(product4);
       // productManager1.editProduct(1, product2);

        System.out.println();
        System.out.println("Tim kiem");
        productManager1.searchProduct("dau goi");
        //System.out.println(productManager1.listProduct);
        System.out.println("Sap xep tang dan");
        productManager1.sortPriceAscending();
        System.out.println("Sap xep giam dan");
        productManager1.sortPriceDecrease();
        System.out.println("Sap xep theo gia va ten");
        productManager1.sortPriceName();

    }
}

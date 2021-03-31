package _11_java_collection_framework._product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager=new ProductManager();
        Product product;
        int choice;
        int id;
        String name;
        int price;
        do {
            System.out.println("1. Them san phan \t 2. Sua thong tin san pham theo id \t 3. Xoa san pham theo id \t 4. Hien thi danh sach san pham");
            System.out.println("5. Tim kiem san pham theo ten \t 6. Sap xep san pham tang dan theo gia \t 7. sap xep san pham giam dan theo gia");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhap id san pham: ");
                    id=scanner.nextInt();
                    System.out.print("Nhap ten san pham: ");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    System.out.print("Nhap gia san pham: ");
                    price=scanner.nextInt();
                    product = new Product(id,name,price);
                    productManager.addProduct(product);
                    break;
                case 2:
                    System.out.print("Nhap id san pham muon sua: ");
                    id=scanner.nextInt();
                    System.out.print("Nhap ten moi: ");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    System.out.print("Nhap gia moi: ");
                    price=scanner.nextInt();
                    product=new Product(id,name,price);
                    productManager.editProduct(id,product);
                    break;
                case 3:
                    System.out.print("Nhap id san pham can xoa: ");
                    id=scanner.nextInt();
                    productManager.deleteProduct(id);
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    System.out.println("Nhap ten san pham can tim: ");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    productManager.searchProduct(name);
                    break;
                case 6:
                    System.out.println("Sap xep san pham tang dan theo gia");
                    productManager.sortPriceAscending();
                    break;
                case 7:
                    System.out.println("Sap xep san pham giam dan theo gia");
                    productManager.sortPriceDecrease();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}

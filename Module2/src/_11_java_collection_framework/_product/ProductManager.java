package _11_java_collection_framework._product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ProductManager {
    List<Product> listProduct = new ArrayList<>();

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public void editProduct(int id, Product product) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                listProduct.set(i, product);
            }
        }
        displayProduct();
    }

    public void deleteProduct(int id) {
//        for (int i=0;i<listProduct.size();i++){
//            if (listProduct.get(i).getId()==id){
//                listProduct.remove(i);
//            }
//        }
        Iterator<Product> iterator = listProduct.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
            }
        }
        displayProduct();
    }

    public void displayProduct() {
//      for (Product element:listProduct){
//          System.out.println(element);
//      }
        Iterator iterator = listProduct.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void searchProduct(String name) {

//        for (int i=0; i<listProduct.size();i++){
//            if (name.equals(listProduct.get(i).getName())){
//                System.out.println(listProduct.get(i));
//            }
//        }

        Iterator<Product> iterator = listProduct.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public void sortPriceAscending() {
        Collections.sort(listProduct, new SortPriceAscending());
        displayProduct();
    }

    public void sortPriceDecrease() {
        Collections.sort(listProduct, new SortPriceDecrease());
        displayProduct();
    }
    public void sortPriceName(){
        Collections.sort(listProduct, new SortPriceName());
        displayProduct();
    }


}

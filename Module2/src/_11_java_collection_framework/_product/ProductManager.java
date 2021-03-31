package _11_java_collection_framework._product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    List <Product> listProduct = new ArrayList<>();
    public void addProduct(Product product){
        listProduct.add(product);
    }
    public void editProduct(int id, Product product){
        for (int i=0;i<listProduct.size();i++){
            if(id==listProduct.get(i).getId()){
                listProduct.set(i, product );
            }
        }
        displayProduct();
    }

    public void deleteProduct(int id){
        for (int i=0;i<listProduct.size();i++){
            if (listProduct.get(i).getId()==id){
                listProduct.remove(i);
            }
        }
        displayProduct();
    }
    public void displayProduct(){
      for (Product element:listProduct){
          System.out.println(element);
      }
    }

    public void searchProduct(String name){
       List <Product> searchListProduct= new ArrayList<>();
        for (int i=0; i<listProduct.size();i++){
            if (name.equals(listProduct.get(i).getName())){
                searchListProduct.add(listProduct.get(i));
            }
        }
        for (Product element:searchListProduct){
            System.out.println(element);
        }

    }
    public void sortPriceAscending(){
        Collections.sort(listProduct,new SortPriceAscending());
        displayProduct();
    }
    public void sortPriceDecrease(){
        Collections.sort(listProduct,new SortPriceDecrease());
        displayProduct();
    }


}

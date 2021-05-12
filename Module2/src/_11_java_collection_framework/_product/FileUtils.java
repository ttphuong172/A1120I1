package _11_java_collection_framework._product;

import _07_abstract_interface.homework.demo.B;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeCVS(Product product) {
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\_11_java_collection_framework\\_product\\products.csv");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(product.getId() + "," + product.getName() + "," + product.getPrice() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
public static List<Product> getProductList(){
    List<Product> productList = new ArrayList<>();
    File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\_11_java_collection_framework\\_product\\products.csv");
    BufferedReader bufferedReader = null;
    String line;
    String[] myArray;
    Product product;
    try {
        FileReader fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
        while ((line = bufferedReader.readLine()) != null) {
            myArray = line.split(",");
            product = new Product(Integer.parseInt(myArray[0]), myArray[1], Integer.parseInt(myArray[2]));
            productList.add(product);
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return productList;
    }

    public static void readFile(){
        List<Product> productList;
        productList=getProductList();
        for (int i=0;i<productList.size();i++){
            System.out.println(productList.get(i));
        }
    }
    public static int getLastId() {
       List<Product> productList;
       productList=getProductList();
        int lastElement = productList.size() - 1;
        if (productList.size() == 0) {
            return 0;
        } else {
            return productList.get(lastElement).getId();
        }
    }

    public static void removeName(String myString){
        List<Product> productList;
        productList=getProductList();
        for (int i=0;i<productList.size();i++){
            if (myString.equals(productList.get(i).getName())){
                productList.remove(i);
            }
        }
        File file =new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\_11_java_collection_framework\\_product\\products.csv");
        BufferedWriter bufferedWriter=null;
        try {
            FileWriter fileWriter=new FileWriter(file);
            bufferedWriter =new BufferedWriter(fileWriter);
            for (int i=0;i<productList.size();i++){
                bufferedWriter.write(productList.get(i).getId()+","+productList.get(i).getName()+","+productList.get(i).getPrice()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

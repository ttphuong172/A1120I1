package _11_java_collection_framework._product;
import java.io.*;
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
}

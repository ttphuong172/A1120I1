package _iotextfile.docfilecsv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\_iotextfile\\docfilecsv\\nation.csv");
        List<String> listNation = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] tempArray;
            while ((line = bufferedReader.readLine()) != null) {
                tempArray = line.split(",");
                System.out.println(tempArray[tempArray.length - 1]);
            }
            for (String element : listNation) {
                System.out.println(element);
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
    }
}

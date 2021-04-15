package _iotextfile.sumfile;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file =new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\_iotextfile\\sumfile\\numbers.txt");
        BufferedReader bufferedReader=null;
        try {
            FileReader fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line;
            int sum=0;
            while ((line=bufferedReader.readLine())!=null){
                int number=Integer.parseInt(line);
                sum+=number;
            }
            System.out.println(sum);
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

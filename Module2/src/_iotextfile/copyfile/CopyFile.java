package _iotextfile.copyfile;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File filesrc = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\_iotextfile\\copyfile\\src.txt");
        File filedes=new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\_iotextfile\\copyfile\\des.txt");

        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            //Read
            FileReader fileReader = new FileReader(filesrc);
            bufferedReader = new BufferedReader(fileReader);
            //Write
            FileWriter fileWriter=new FileWriter(filedes);
            bufferedWriter=new BufferedWriter(fileWriter);
            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.println((char) i);
                bufferedWriter.write((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}

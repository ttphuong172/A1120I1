package _demo._generic._file;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {


    public static void main(String[] args) throws IOException {
        // Get the file
        File f = new File("D:\\program.txt");

        if (f.isFile()) {
            try {
                FileWriter writer = new FileWriter(f);
                String myString = "Cong hoa xa hoi chu nghia Viet Nam";
                for (int i = 0; i < myString.length(); i++) {
                    if (f.canWrite()) {
                        writer.write(myString.charAt(i));
                    } else {
                        System.out.println("Can not write");
                    }
                }
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File is not exit");
        }
        //Read file
        try (FileReader fr = new FileReader("D:\\program.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e ){
            e.printStackTrace();
        }
    }
}


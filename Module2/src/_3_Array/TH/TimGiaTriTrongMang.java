package _3_Array.TH;
import java.util.Scanner;
public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhap vao ten can tim");
        String name=scanner.nextLine();
        boolean isExist=false;
        for(int i=0;i<students.length;i++){
            if (students[i].equals(name)){
               isExist=true;
                System.out.println("Tim duoc "+name+" o vi tri "+i);
            }
        }
        if (!isExist){
            System.out.println("Khong tim thay "+name);
        }

    }


}

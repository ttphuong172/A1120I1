package _10_stack_queue._reverse_array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppearMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> myMap = new HashMap<>();
        //System.out.println("Nhap vao mot chuoi can kiem tra");
        //String myString=scanner.nextLine();
        String myString = "thay sinh vat vat co sinh vat vat xong roi sinh sinh xong roi vat";
        String[] myArray = myString.split(" ");
        for (String element : myArray) {
            int count = 1;
            System.out.println(element);
            boolean isHas = myMap.containsKey(element);
            if (isHas) {
                count = myMap.get(element) + 1;
                System.out.println(count);
            }
            myMap.put(element, count);
        }
        //Hien thi HashMap
        System.out.println(myMap);
    }
}

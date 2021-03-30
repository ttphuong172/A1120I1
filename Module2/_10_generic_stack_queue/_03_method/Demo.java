package _03_method;

import java.util.Scanner;

public class Demo {

    public static void sum(int num1, int num2) {
        System.out.println(num1 + num2);
//        return;
    }

    public static int sum2(int num1, int num2) {
        return num1 + num2;
    }

    public static String str(int num1, int num2) {
        return "C11";
    }

    public static int[] newArray(int[] oldArr) {
        int[] newArray = new int[oldArr.length + 1];

        for (int index = 0; index < oldArr.length; index++) {
            newArray[index] = oldArr[index];
        }

        return newArray;
    }

    public static int[] newArray2(int[] oldArr, int newElement) {
        int[] newArray;
        if (oldArr == null) {
            newArray = new int[1];
        } else {
            newArray = new int[oldArr.length + 1];

            for (int index = 0; index < oldArr.length; index++) {
                newArray[index] = oldArr[index];
            }
        }
        newArray[newArray.length - 1] = newElement;

        return newArray;
    }

    public static int[] inputNumber() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int[] arr = null;

        while (true) {
            System.out.print("input number: ");
            number = scanner.nextInt();
            if (number == 0) break;
            arr = newArray2(arr, number);
        }

        return arr;
    }

    public static void main(String[] args) {

//       int[] arr = {1,2,3,4};
//       int[] arr2 = newArray(arr);
//
//       for(int element: arr2){
//           System.out.print(element + " ");
//       }

        int[] arr3 = inputNumber();
        for (int element : arr3) {
            System.out.print(element + " ");
        }
    }
}

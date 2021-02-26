package _1_introductiontoJava;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        String donvi = "";
        String chuc = "";
        String tram = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so can doc:");
        int number = scanner.nextInt();
        int hangdonvi = number % 100;
        int hangchuc = number%10;
        int hangtram=number/100;
        if (number < 10) {
            switch (hangdonvi) {
                case 1:
                    donvi = "one";
                    break;
                case 2:
                    donvi = "two";
                    break;
                case 3:
                    donvi = "three";
                    break;
                case 4:
                    donvi = "four";
                    break;
                case 5:
                    donvi = "five";
                    break;
                case 6:
                    donvi = "six";
                    break;
                case 7:
                    donvi = "seven";
                    break;
                case 8:
                    donvi = "eight";
                    break;
                case 9:
                    donvi = "nine";
                    break;
            }
            System.out.println(chuc + donvi);
        } else if (number < 16) {
            switch (number) {
                case 10:
                    chuc = "ten";
                    break;
                case 11:
                    chuc = "eleven";
                    break;
                case 12:
                    chuc = "twele";
                case 13:
                    chuc = "thirteen";
                case 14:
                    chuc = "fourteen";
                case 15:
                    chuc = "fifteen";

            }
            System.out.println(chuc + donvi);
        } else if (number < 20) {
            switch (hangdonvi) {
                case 1:
                    donvi = "one";
                    break;
                case 2:
                    donvi = "two";
                    break;
                case 3:
                    donvi = "three";
                    break;
                case 4:
                    donvi = "four";
                    break;
                case 5:
                    donvi = "five";
                    break;
                case 6:
                    donvi = "six";
                    break;
                case 7:
                    donvi = "seven";
                    break;
                case 8:
                    donvi = "eight";
                    break;
                case 9:
                    donvi = "nine";
                    break;
            }
            switch (hangchuc) {
                case 1:
                    chuc = "teen";
            }
            System.out.println(donvi + chuc);
        } else if (number < 100) {
            switch (hangdonvi) {
                case 1:
                    donvi = "one";
                    break;
                case 2:
                    donvi = "two";
                    break;
                case 3:
                    donvi = "three";
                    break;
                case 4:
                    donvi = "four";
                    break;
                case 5:
                    donvi = "five";
                    break;
                case 6:
                    donvi = "six";
                    break;
                case 7:
                    donvi = "seven";
                    break;
                case 8:
                    donvi = "eight";
                    break;
                case 9:
                    donvi = "nine";
                    break;
            }
            switch (hangchuc) {
                case 1:
                    chuc = "teen";
                    break;
                case 2:
                    chuc = "twenty";
                    break;
                case 3:
                    chuc = "thirty";
                    break;
                case 4:
                    chuc = "forty";
                    break;
                case 5:
                    chuc = "fifty";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "seventy";
                    break;
                case 8:
                    chuc = "eighty";
                    break;
                case 9:
                    chuc = "ninety";
                    break;

            }
            System.out.println(chuc + donvi);
        } else if (number<1000){
            switch (hangdonvi) {
                case 1:
                    donvi = "one";
                    break;
                case 2:
                    donvi = "two";
                    break;
                case 3:
                    donvi = "three";
                    break;
                case 4:
                    donvi = "four";
                    break;
                case 5:
                    donvi = "five";
                    break;
                case 6:
                    donvi = "six";
                    break;
                case 7:
                    donvi = "seven";
                    break;
                case 8:
                    donvi = "eight";
                    break;
                case 9:
                    donvi = "nine";
                    break;
            }
            switch (hangchuc) {
                case 1:
                    chuc = "teen";
                    break;
                case 2:
                    chuc = "twenty";
                    break;
                case 3:
                    chuc = "thirty";
                    break;
                case 4:
                    chuc = "forty";
                    break;
                case 5:
                    chuc = "fifty";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "seventy";
                    break;
                case 8:
                    chuc = "eighty";
                    break;
                case 9:
                    chuc = "ninety";
                    break;

            }
            switch (hangtram){
                case 1:
                    tram="one hundred";
            }
            System.out.println(tram+chuc + donvi);
        }

    }

}

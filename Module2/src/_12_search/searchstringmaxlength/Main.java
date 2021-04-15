package _12_search.searchstringmaxlength;

import java.awt.image.Kernel;

public class Main {
    public static void main(String[] args) {
        String myString = "ebdafgthdw";
        char ketQua = myString.charAt(0);
        System.out.println(ketQua);
        for (int j = 1; j < myString.length(); j++) {
            if (myString.charAt(j) > ketQua) {
                System.out.println(myString.charAt(j));
                ketQua = myString.charAt(j);
            }

        }
    }
}


package _demo._generic;

import java.util.regex.Pattern;

public class Test {
    public static boolean checkNameException(String myString){
        String regex="^\\d{3}\\s\\d{3}\\s\\d{3}$";
        return Pattern.matches(regex,myString);
    }
    public static void main(String[] args) {
        //String myString="ttphuong172@gmail.com";
        String myString="123 123 123";
        System.out.println(checkNameException(myString));


    }

}

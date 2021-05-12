package furamaresort.models;

import java.time.LocalDate;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    public static boolean checkIdVilla(String string) {
        String regex = "^SVVL-\\d{4}";
        return Pattern.matches(regex, string);
    }

    public static boolean checkFormatDate(String string) {
        String regex = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
        return Pattern.matches(regex, string);
    }
    public static boolean checkAgeDate(String string){
        LocalDate myObj = LocalDate.now();

        String [] dateArray=string.split("/");

        int currentYear=myObj.getYear();
        int birthdayYear=Integer.parseInt(dateArray[2]) ;
        int age=currentYear-birthdayYear;
        if(age>18){
            return true;
        } else
            return false;

    }

    public static boolean checkIdHouse(String string) {
        String regex = "^SVHO-\\d{4}";
        return Pattern.matches(regex, string);
    }

    public static boolean checkIdRoom(String string) {
        String regex = "^SVRO-\\d{4}";
        return Pattern.matches(regex, string);
    }

    public static boolean checkNameServive(String string) {
        String regex = "^[A-Z][a-z]*";
        return Pattern.matches(regex, string);
    }

    public static boolean checkArea(String string) {
        String regex = "^[0-2]?[0-9]";
        return Pattern.matches(regex, string);
    }

    public static boolean checkRentalCost(String string) {
        String regex = "^[1-9][0-9]*$";
        return Pattern.matches(regex, string);
    }

    public static boolean checkMaxPerson(int maxPerson) {
        if ((maxPerson < 0) || (maxPerson > 20)) {
            return false;
        }
        return true;
    }

    public static boolean checkNameException(String myString) {
        String regex = "^[A-Za-z\\s]+$";
        return Pattern.matches(regex, myString);
    }

    public static boolean checkEmailException(String myString) {
        String regex ="^[\\p{L}\\p{N}\\._%+-]+@[\\p{L}\\p{N}\\.\\-]+\\.[\\p{L}]{2,}$";
        return Pattern.matches(regex, myString);
    }

    public static boolean checkIdCardException(String myString) {
        String regex = "^\\d{3}\\s\\d{3}\\s\\d{3}$";
        return Pattern.matches(regex, myString);
    }



    public static void main(String[] args) {
        System.out.println(checkNameException("Tran hanh Phuong"));
        ;
    }
}

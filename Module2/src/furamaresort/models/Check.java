package furamaresort.models;

public class Check {
    public static boolean checkArea(int area){
        if(area<30){
            return  false;
        }
        return true;
    }
    public static boolean checkRentalCost(int rentalCost){
        if (rentalCost <0){
            return false;
        }
        return true;
    }
    public static boolean checkMaxPerson(int maxPerson){
        if ((maxPerson<0) || (maxPerson>20)){
            return false;
        }
        return true;

    }

}

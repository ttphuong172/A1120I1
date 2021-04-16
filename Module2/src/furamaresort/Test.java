package furamaresort;

import furamaresort.models.*;

import java.lang.invoke.SerializedLambda;

public class Test {
    public static void main(String[] args) {
        FEManager feManager1=new FEManager();
        Services services1 = new Villa("1", "ABC", 25, 2500, 8, "day", "VIP", "Loi di rieng", 25, 2);
        feManager1.addNewServices(services1);
        System.out.println();
    }
}

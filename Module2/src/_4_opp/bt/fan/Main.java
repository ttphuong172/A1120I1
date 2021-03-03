package _4_opp.bt.fan;

public class Main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan(Fan.FAST, true, 10.0, "yellow");
        Fan Fan2 = new Fan(Fan.MEDIUM, false, 5.0, "blue");
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
    }
}

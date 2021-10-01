package game;

public class Player {
    int number;
    void guess(){
        number=(int) Math.random()*10;
        System.out.println("");
    }
}

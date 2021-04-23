package furamaresort.models;

import java.util.LinkedList;
import java.util.Queue;

public class CinemaManager {
    Queue<String> customerQueue=new LinkedList<>();

    public void addTicket(String name,int amountTicket) {
        for (int i = 0; i < amountTicket; i++) {
            customerQueue.add(name);
        }
    }
    //In ve khi full ghe
    public void displayTicket(){
        int i=1;
        while (!customerQueue.isEmpty())
        System.out.println(customerQueue.poll()+ "- So ghe: "+i++);
    }
    public int checkTicket(){
      return 10-customerQueue.size();
    }
}

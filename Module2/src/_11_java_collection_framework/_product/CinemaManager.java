package _11_java_collection_framework._product;

import furamaresort.models.Customer;

import java.util.LinkedList;
import java.util.Queue;

public class CinemaManager {
    Queue<Customer> customerQueue=new LinkedList<>();

    public void addTicket(Customer customer,int amountTicket) {
        System.out.println(customerQueue.size());
        for (int i = 0; i < amountTicket; i++) {
            customerQueue.add(customer);
        }
    }
}

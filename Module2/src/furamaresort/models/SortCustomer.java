package furamaresort.models;

import java.util.Comparator;

public class SortCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getName().equals(o2.getName())){
            return o1.getBirthday().compareTo(o2.getBirthday());
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}

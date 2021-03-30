package _07_abstract_interface.homework.car;

import java.util.Comparator;

public class ComparatorExample implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Vehicle vehicle1= (Vehicle) o1;
        Vehicle vehicle2= (Vehicle) o2;
        return vehicle1.getBrand().compareTo(vehicle2.getBrand());
    }
}

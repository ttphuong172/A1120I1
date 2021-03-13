package _07_abstract_interface.th.comparable;

import _06_inhenritance.th.shape.Circle;

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle() {
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

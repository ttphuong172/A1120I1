package _08_sort;

import java.util.Comparator;

public class SortByIdStudent implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        return student1.getId() - student2.getId();
    }
}

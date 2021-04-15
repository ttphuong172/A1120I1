package _11_java_collection_framework.th._comparable_comparator;

import java.util.Comparator;

public class AgeDecrease implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
       Student student1= (Student) o1;
       Student student2= (Student) o2;
       return student2.getAge()-student1.getAge();
    }
}

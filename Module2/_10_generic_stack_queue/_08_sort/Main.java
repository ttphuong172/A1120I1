package _08_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"A2");
        Student student2 = new Student(3,"D");
        Student student3 = new Student(2,"E");
        Student student4 = new Student(4,"B");
        Student student5 = new Student(2,"A1");

        Student[] lop_A11 = new Student[5];
        lop_A11[0] = student1;
        lop_A11[1] = student2;
        lop_A11[2] = student3;
        lop_A11[3] = student4;
        lop_A11[4] = student5;

        for(int index = 0; index < lop_A11.length; index++){
            System.out.println(lop_A11[index]);
        }

//        Arrays.sort(lop_A11);
        Arrays.sort(lop_A11, new SortByIdStudent());
//        Arrays.sort(lop_A11, new SortByNameStudent());
        System.out.println("-------------");

        for(int index = 0; index < lop_A11.length; index++){
            System.out.println(lop_A11[index]);
        }
    }
}

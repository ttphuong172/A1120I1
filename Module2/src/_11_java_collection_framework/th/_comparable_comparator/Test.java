package _11_java_collection_framework.th._comparable_comparator;

import _07_abstract_interface.homework.demo.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student("Sam", 30, "Que Son");
        Student student2=new Student("Trong", 25,"Dai Loc");
        Student student3=new Student("Phuong",35,"Dien Ban");
        List <Student> listStudent=new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        Collections.sort(listStudent);
        System.out.println("-----------------Sap xep tang dan su dung Comparable-----------------");
        for(Student student:listStudent){
            System.out.println(student);
        }

        Collections.sort(listStudent,new AgeDecrease());
        System.out.println("-----------------Sap xep giam dan su dung Comparator-----------------");
        for(Student student:listStudent){
            System.out.println(student);
        }
    }


}

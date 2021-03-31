package _11_java_collection_framework._hashset_hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Tao cac doi tuong Sinh vien
        Student student1=new Student("Trong",23,"Dai Loc");
        Student student2=new Student("Sam",30,"Que Son");
        Student student3=new Student("Thang",27,"Lien Chieu");

        //Luu sinh vien su dung HashMap
        Map<Integer,Student> myHashMap=new HashMap<>();
        myHashMap.put(1,student1);
        myHashMap.put(2,student2);
        myHashMap.put(3,student3);
        //Duyet tung thanh phan trong HashMap
        System.out.println("HashMap");
        for (Map.Entry<Integer,Student> element:myHashMap.entrySet()){
            System.out.println(element.getKey()+"-"+ element.getValue().getName());
        }
        //Luu sinh vien su dung HashSet
        Set<Student > myHashSet=new HashSet<>();
        myHashSet.add(student1);
        myHashSet.add(student2);
        myHashSet.add(student3);
        //Duyet tung phan tu trong HashSet
        System.out.println("HashSet");
        for (Student element:myHashSet){
            System.out.println(element.getName());
        }

    }
}

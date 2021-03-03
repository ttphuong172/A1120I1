package _05_access_modifier.th.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String collage="BKDN";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        collage="CODeGYM";
    }
    void display(){
        System.out.println(rollno+name+collage);
    }
}

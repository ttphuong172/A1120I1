package _04_oop;

public class Test {
    public static void main(String[] args) {
        Student student_1 = new Student(1, "Hong");
        Student student_2 = new Student();

        student_2.setName("Sam");
        System.out.println(student_1.getId() + " - "  + student_1.getName());
        System.out.println(student_2.getId() + " - "  + student_2.getName());

//        student_1 = null;
//        student_2 = null;
    }
}

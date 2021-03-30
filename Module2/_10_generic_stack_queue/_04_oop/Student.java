package _04_oop;

public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public Student () {}

    public Student(int newId, String newName){
        System.out.println("Da goi constructor 2 tham so");
        this.id = newId;
        this.name = newName;

    }
//
    public Student(){
        this(99, "no name");
        System.out.println("Da goi constructor 0 tham so");
    }

//
//    public Student(int newId){
//        this.id = newId;
//    }
}

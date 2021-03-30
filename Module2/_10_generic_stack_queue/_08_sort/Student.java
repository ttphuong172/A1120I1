package _08_sort;

public class Student {
    private int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        Student otherStudent = (Student) o;
//        int result = this.id - otherStudent.id;
//        if (result == 0) {
//            return this.name.compareTo(otherStudent.name);
//        }
//        return result;
//        return  this.name.compareTo(otherStudent.name);
//        return  otherStudent.name.compareTo(this.name);
        /*
         * =0 hai doi tuong = 0
         * >0 doi tuong ve trai se lon hon ve phai
         * < 0 ve trai be hon ve phai
         * */
//    }
}

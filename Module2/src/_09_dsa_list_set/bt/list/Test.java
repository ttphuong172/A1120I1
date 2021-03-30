package _09_dsa_list_set.bt.list;

public class Test {

    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

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
    }
    public static void main(String[] args) {
        Student student1 = new Student(1, "Trong");
        Student student2 = new Student(2, "Sam");
        MyList<Student> listStudent = new MyList<Student>();
        listStudent.add(student1);
        listStudent.add(student2);
        System.out.println(listStudent.size);

        for (int i = 0; i < listStudent.size; i++) {
            System.out.println(listStudent.get(i).getId() + listStudent.get(i).getName());
        }
        listStudent.remove(0);
        System.out.println("---------------");
        for (int i = 0; i < listStudent.size; i++) {
            System.out.println(listStudent.get(i).getId() + listStudent.get(i).getName());
        }
        System.out.println(listStudent.size());
    }


}

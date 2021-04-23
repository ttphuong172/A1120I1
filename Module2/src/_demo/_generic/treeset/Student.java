package _demo._generic.treeset;

public class Student implements Comparable<Student > {
    private String name;
    private int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

}

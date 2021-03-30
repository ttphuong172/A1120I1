package _07_abstract_interface.homework.demo;

public class B extends A {
    public B() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        String name = "Hoang";
        String ho = "Hoang";
        System.out.println(name.hashCode());
        System.out.println(ho.hashCode());

        String firstName = new String("Nam");
        String lastName = new String("Nam");
        System.out.println(firstName.hashCode());
        System.out.println(lastName.hashCode());
    }
}

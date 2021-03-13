package _07_abstract_interface.th.animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chic chic";
    }

    @Override
    public String howToEat() {
        return null;
    }
}

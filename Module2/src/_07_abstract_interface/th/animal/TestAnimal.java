package _07_abstract_interface.th.animal;


public class TestAnimal {
    public static void main(String[] args) {
      Animal[] animals=new Animal[2];
      animals[0]=new Tiger();
      animals[1]=new Chicken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible1=(Chicken) animal;
                System.out.println(edible1.howToEat());
            }
        }
        }

    }


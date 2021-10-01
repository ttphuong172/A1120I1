package Array;

public class Dog {
    String name;
    void bark(){
        System.out.println("Tao sua ten tao"+this.name);
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        int [] myArray={1,2,3};

        dog.changeArray(myArray);
        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
    void changeArray(int [] arr){
        arr[0]=3;
    }

}

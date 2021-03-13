package _07_abstract_interface.bt.colorable;

public class Test {
    public static void main(String[] args) {
        Shape shapes[]=new Shape[3];
        shapes[0]=new Circle("red",5);
        shapes[1]=new Square("blue",5);
        shapes[2]=new Rectangle("red",5,3);
        for (Shape shape:shapes){
            System.out.println(shape.getArea());
           if (shape instanceof Colorable){
             ((Colorable) shape).howToColor();
           }
        }
    }
}

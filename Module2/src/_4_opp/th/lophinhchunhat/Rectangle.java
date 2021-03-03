package _4_opp.th.lophinhchunhat;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(){

    }
    public Rectangle(double rong,double cao){
        this.width=rong;
        this.height=cao;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.getHeight()*getWidth();
    }
    public double getPerimetter(){
        return (this.getHeight()+this.getWidth()*2);
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}

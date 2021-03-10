package _06_inhenritance.bt.point;

import java.lang.reflect.Array;

public class Point2D {
    public float x;
    public float y;

    public Point2D() {
        this.x=0.0f;
        this.y=0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public  float[] getXY(){
        float [] arr={this.x,this.y};
        return arr;
    }

    @Override
    public String toString() {
        return x+ ","+y;
    }
}

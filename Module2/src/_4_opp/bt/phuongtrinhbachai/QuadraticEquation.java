package _4_opp.bt.phuongtrinhbachai;

import _4_opp.TH.LopHinhChuNhat.Rectangle;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return this.getB()*this.getB()-4*this.getA()*this.getC();
    }
    public double getRoot1(){
        return (-this.getB()+Math.sqrt(this.getB()*this.getB()-4*this.getA()*this.getC()))/2*this.getA();
    }
    public double getRoot2(){
        return (-this.getB()-Math.sqrt(this.getB()*this.getB()-4*this.getA()*this.getC()))/2*this.getA();
    }

}

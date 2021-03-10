package _06_inhenritance.bt.movablepoint;

public class MovablePoint extends Point {
    public float xSpeed;
    public float ySpeed;

    public MovablePoint() {
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float [] getSpeed(){
        float [] arr={this.x,this.y};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString()+ "speed=("+this.xSpeed+","+this.ySpeed+")";
    }

    public MovablePoint move(){
        this.x+=xSpeed;
        this.y+=ySpeed;
        return this;
    }
}

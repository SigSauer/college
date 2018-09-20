package oop.step2.exam.task4;

public class RobotAdd {
    private double x;
    private double y;

    public RobotAdd(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x +" y: " + y;
    }
}

package oop.step1.lesson_2;

/**
 * Created by PDV00 on 27.10.2017.
 */

public class Robot {
    private int x;
    private int y;
    int cours;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}


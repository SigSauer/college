package oop.step2.lesson2;

import java.util.Objects;

public class Fibonacci {
    private int x;
    private int y;
    private int value;
    private int value_1;
    private int value_2;

    public Fibonacci(int x, int y, int value, int value_1, int value_2) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.value_1 = value_1;
        this.value_2 = value_2;
    }

    public Fibonacci() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue_1() {
        return value_1;
    }

    public void setValue_1(int value_1) {
        this.value_1 = value_1;
    }

    public int getValue_2() {
        return value_2;
    }

    public void setValue_2(int value_2) {
        this.value_2 = value_2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fibonacci fibonacci = (Fibonacci) o;
        return x == fibonacci.x &&
                y == fibonacci.y &&
                value == fibonacci.value &&
                value_1 == fibonacci.value_1 &&
                value_2 == fibonacci.value_2;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, value, value_1, value_2);
    }

    @Override
    public String toString() {
        return "Fibonacci value: " +
                "\nx: " + x +
                "\ny: " + y +
                "\nvalue: " + value +
                "\nvalue_1: " + value_1 +
                "\nvalue_2: "  + value_2;
    }
}

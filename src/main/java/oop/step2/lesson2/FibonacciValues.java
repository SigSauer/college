package oop.step2.lesson2;

public class FibonacciValues {
    private int value;
    private int prev1Value;
    private int prev2Value;

    public FibonacciValues(int value, int prev1Value, int prev2Value) {
        this.value = value;
        this.prev1Value = prev1Value;
        this.prev2Value = prev2Value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPrev1Value() {
        return prev1Value;
    }

    public void setPrev1Value(int prev1Value) {
        this.prev1Value = prev1Value;
    }

    public int getPrev2Value() {
        return prev2Value;
    }

    public void setPrev2Value(int prev2Value) {
        this.prev2Value = prev2Value;
    }


}

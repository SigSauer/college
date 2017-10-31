package algorithms.lab_2_3;

public class StackControl {
    private int size;
    static private int[] stackArr;
    private int top = -1;
    private boolean updateArray = false;

     StackControl(int size) {
        this.size = size;
        stackArr = new int[size];
    }

     void push(int i) {
        top++;
        System.out.println("Pushing " + i);
        if(updateArray)
            updateStackSize();
        stackArr[top] = i;
    }

    private void updateStackSize() {
        if (top == stackArr.length - 1) {
            int stackTemp[] = stackArr;
            stackArr = new int[(stackTemp.length * 3) / 2 + 1];
            System.arraycopy(stackTemp, 0, stackArr, 0, stackTemp.length);
        }
    }

    public void pop() {
        int i = stackArr[top];
        top--;
        System.out.println("Popping " + i);
        stackArr[top]=0;
    }

    public int top() {
        System.out.println("Peek " + stackArr[top]);
        return stackArr[top];
    }

     boolean isFull() {
        return (top == size - 1);
    }

     boolean isEmpty() {
        return (top == -1);
    }


     void swap() {
        int i = stackArr[top];
        stackArr[top] = stackArr[top - 1];
        stackArr[top - 1] = i;
    }

     void clear() {
        stackArr = new int[this.size];
    }

     int[] getStackArr() {
        return stackArr;
    }

    public boolean isUpdateArray() {
        return updateArray;
    }

     void setUpdateArray(boolean updateArray) {
        this.updateArray = updateArray;
    }
}























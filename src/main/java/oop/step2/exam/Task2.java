package oop.step2.exam;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void task2(int len) {
        Random r = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = r.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
    }
}

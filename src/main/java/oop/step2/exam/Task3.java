package oop.step2.exam;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void task3(int len) {
        Random r = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = r.nextInt(100);
        }

        int[] arrayIncr = new int[array.length*2];
        for (int i = 0; i < array.length; i++) {
            arrayIncr[i] = array[i] * 2;
        }
        System.arraycopy(array,0,arrayIncr,array.length,array.length);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayIncr));
    }
}

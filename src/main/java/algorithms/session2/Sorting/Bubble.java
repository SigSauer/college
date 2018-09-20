package algorithms.session2.Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        System.out.println("Выберете пункт меню\n1. Random\n2. Hand input");
        switch (sc.nextInt()) {
            case 1:
                Random r = new Random();
                for (int i = 0; i < array.length; i++) {
                    array[i] = r.nextInt(100);
                }
                break;
            case 2:
                for (int i = 0; i < array.length; i++) {
                    array[i] = sc.nextInt();
                }
                break;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] =  temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
    return array;
    }
}

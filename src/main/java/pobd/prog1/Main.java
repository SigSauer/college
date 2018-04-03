package pobd.prog1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *      Creating by SigSauer
 */

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        int[] arrayDemo = creteArray();
        while (exit) {
            System.out.println("Choose on  index of menu: \n" +
                    "0. Exit \n" +
                    "1. 2 elements sum of which = 0 \n" +
                    "2. 4 elements sum of which = 0 \n" +
                    "3. 0 to begin \n" +
                    "4. Soring \n" +
                    "5. Count of same elements of array \n");
            switch (sc.nextInt()) {
                case 0: exit = false; break;
                case 1: sum0El2(arrayDemo); break;
                case 2: sum0El4(arrayDemo); break;
                case 3: forward0(arrayDemo); break;
                case 4: sort(arrayDemo); break;
                case 5: sameElem(arrayDemo); break;

            }
        }
    }

    private static int[] creteArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array's length");
        int[] array = new int[sc.nextInt()];
        System.out.println("Entering the elements of the array");
        for (int i = 0; i < array.length; i++)
            if( i == (int) (Math.random()*array.length)) array[i] = 0;
            else array[i] = (int) (Math.random() * 300) - 150;
        System.out.println("Ready");
        System.out.println(Arrays.toString(array));
        System.out.println();
        return array;
    }

    private static void sum0El2(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 0) count++;
            }
        }
        System.out.println("count of 0sum elements: " + count);
    }

    private static void sum0El4(int[] array) {
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        if (array[i] + array[j] + array[k] + array[l] == 0) count++;
                    }
                }
            }
        }
        System.out.println("count of 0sum elements: " + count);
    }

    private static void forward0(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[j] == 0) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("fisrt0 array: "+Arrays.toString(array));
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }

            }
        }
        System.out.println("sorting array: "+Arrays.toString(array));
    }

    private static void sameElem(int[] array) {
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) count++;
            }
        }
        System.out.println("count of same elements: "+count);
    }




}



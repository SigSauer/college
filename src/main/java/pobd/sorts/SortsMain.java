package pobd.sorts;

import java.util.Arrays;
import java.util.Scanner;

public class SortsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array");
        int arrLength = sc.nextInt();
        int[] arrayDemo = createArray(arrLength);
        System.out.println(Arrays.toString(arrayDemo));
        System.out.println("Array is ready ");
        qsort(arrayDemo);
        bubblesort(arrayDemo);
    }

    private static int[] createArray(int l) {
        int[] arrayDemo = new int[l];
        for (int i = 0; i < l; i++) {
            arrayDemo[i] = (int) ((Math.random()*300)-150);
        }
        return arrayDemo;
    }

    private static void qsort(int[] array) {
        System.out.println("qsort");
        long timeBegin = System.currentTimeMillis();
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
        System.out.println("Sorting is working for "+ (System.currentTimeMillis()-timeBegin)+" ms");
    }

    private static void bubblesort(int[] array) {
        System.out.println("bubble sort");
        long timeBegin = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[j-1] > array[j]) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sorting is working for "+ (System.currentTimeMillis()-timeBegin)+" ms");
    }



    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;     //завершить выполнение если длина массива равна 0
        if (low >= high)
            return;     //завершить выполнение если уже нечего делить
            // выбрать опорный элемент
            int middle = low + (high - low) / 2;
            int opora = array[middle];

            // разделить на подмассивы, который больше и меньше опорного элемента
            int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
        i++;
            }
        while (array[j] > opora) {
            j--;
        }
        if (i <= j) {   //меняем местами
                int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
            }
        }

         // вызов рекурсии для сортировки левой и правой части
         if (low < j)
            quickSort(array, low, j);

         if (high > i)
            quickSort(array, i, high);
         }

}

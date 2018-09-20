package algorithms.session2.Sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random r = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int x = array[low+(high-low) / 2];
        do {
            while(array[i] < x) ++i;
            while(array[j] > x) --j;
            if(i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }while(i <= j);
        System.out.println(Arrays.toString(array));
        if(low < j) sort(array, low, j);
        if(i < high) sort(array, i, high);
    }
}

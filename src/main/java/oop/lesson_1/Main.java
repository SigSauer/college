package oop.lesson_1;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by PDV00 on 22.09.2017.
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) System.out.print("X ");
            System.out.println("X ");
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            if (i == 0 || i == 3)
                for (int j = 0; j < 4; j++)
                    System.out.print("X ");
            else System.out.print("X       ");
            System.out.println("X ");

        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i > 0 && i < 3) && (j > 0 && j < 4)) System.out.print("  ");
                else System.out.print("X ");
            }
            System.out.println("X ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4 || i == j || i + j == 4) System.out.print("X ");
                else System.out.print("  ");
            }
            System.out.println("  ");
        }
        System.out.println();
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 4 || j == 0 || i == j) System.out.print("X ");
                else System.out.print("  ");
            }
            System.out.println();


        }
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (j == 2 || i == 5 || i == 2 || j - i == 2 || i + j == 6 || i - j == 2 || i + j == 2) {
                    System.out.print("X ");
                } else
                    System.out.print("  ");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[ "+i+" ; "+j+" ]");
            }
            System.out.println();
        }
        System.out.println();
        int a = 2;
        int b = 5;
        System.out.println("a = "+a+" b = "+b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = "+a+" b = "+b);

        System.out.println();


        int[] array = new int[] {12, 45, 54, 1, 0, -453, 23, 185, 100};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        input();
        sorting();
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of array: ");
        int[] massive = new int[scanner.nextInt()];
        System.out.println("Input elements of array (through Enter): ");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = scanner.nextInt();
        }
        minmax(massive);
        sort1(massive);
        sort2(massive);
        sort3(massive);
        sort4(massive);
    }

    public static void sort1 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        out(arr);
    }

    public static void sort2 (int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        out(arr);
    }

    public static void sort3 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        out(arr);

    }

    public static void sort4 (int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
        out(arr);
    }

    static void out (int[] mas) {
        System.out.println(Arrays.toString(mas));
    }

    static void minmax(int[] mas) {
        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if(max < mas[i]) max = mas[i];
            if(min > mas[i]) min = mas[i];
                   }
        System.out.println("Minimum: "+min+"\nMaximum: "+max);
    }

    static void sorting() {
        System.out.println();
        int[] sortmas = new int[30];
        for (int i = 0; i < sortmas.length; i++) {
            sortmas[i] = (int)(Math.random()*60);
        }
        System.out.println("Deffault array:\n"+Arrays.toString(sortmas)+"\n");

        for (int i = 0; i < sortmas.length; i++) {
            for (int j = 1; j < sortmas.length; j++) {
                if (sortmas[j] < sortmas[j - 1]) {
                    int tmp = sortmas[j - 1];
                    sortmas[j - 1] = sortmas[j];
                    sortmas[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(sortmas));
        }
    }


}

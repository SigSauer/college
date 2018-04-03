package oop.step1.control_work;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println("task 1: ");
        int tsk = 16;
        while (tsk >= 1) {
            System.out.print(tsk+" ");
            tsk = tsk/2;
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("task 2: ");
        int[] arr = {0, 10, 20, 30, 40, 50, 60 , 70, 80, 90};
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    private static void task3() {
        System.out.println("task 3: ");
        int[] arr1 = new int[] {1, 2, 3, 4};
        int[] arr2 = new int[] {5, 6, 7, 8};
        int[] arrRes = new int[arr1.length+arr2.length];
        System.arraycopy (arr1, 0, arrRes, 0, arr1.length);
        System.arraycopy(arr2,0,arrRes,arr1.length,arr2.length);
        System.out.println(Arrays.toString(arrRes));
    }

    private static void task4() {
        System.out.println("task 4: ");
        int[] arr = new int[] {1, 10, 20, 3, 2000, 5, 600, 700, 8, 1000};
        System.out.println(Arrays.toString(arr));
        System.out.println("method 1: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("method 2:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]) {
                    arr[j]+=arr[j-1];
                    arr[j-1] = arr[i] - arr[i-1];
                    arr[j]-=arr[j-1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    private static void task5() {
        int[][] arr1 = new int[][] {{2, 3}, {2, 4}};
        int[][] arr2 = new int[][] {{0, 1}, {5, 6}};
        int m = arr1.length;
        int n = arr2[0].length;
        int o = arr2.length;
        int[][] arrRes = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    arrRes[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
            System.out.println();
        }

        for (int i = 0; i < arrRes.length; i++) {
            for (int j = 0; j < arrRes.length; j++) {
                System.out.print(arrRes[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void task6() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i > 0 && i < 5) && (j > 0 && j < 9)) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void task7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value: ");
        double in = sc.nextDouble();
        if(in >= 0 ) System.out.println(Math.sqrt(in));
        else System.out.println("Wrong input");
    }


}

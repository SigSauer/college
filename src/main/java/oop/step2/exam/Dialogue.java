package oop.step2.exam;

import java.util.Scanner;

public class Dialogue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //task1
        System.out.println("Завдання 1:");
        int[] array = new int[] {7, 5, 6, 7, 9, 1, 11, 12, 13, 18};

        //task2
        System.out.println("Завдання 2: Введіть довжину масиву: ");
        Task2.task2(sc.nextInt());

        //task3
        System.out.println("Завдання 3: Введіть довжину масиву: ");
        Task3.task3(sc.nextInt());

    }
}

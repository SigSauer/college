package practice.lab3;

import java.util.Scanner;

//Меню виклику методу по вирішенню відповідного завдання
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Input index of task: ");
            switch (sc.nextInt()) {
                case 1:
                    task001();
                    break;
                case 2:
                    task002();
                    break;
            }
        }
    }

    //Завдання 1
    public static void task001() {
        int[][] array = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (Math.random()*10);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int[] max = new int[] {0,0,0,0,0,0};
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if(max[i] < array[i][j]) {
                    max[i] = array[i][j];
                    int tmp = max[i];
                    array[i][j] = array[i][0];
                    array[i][0] = tmp;

                }
            }
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Завдання 2
    public static void task002()  {
            PriceList folder = new PriceList("Папка","K", 4.75,4);
            PriceList paper = new PriceList("Папір","K", 13.9,10);
            PriceList calc = new PriceList("Калькулятор","О", 411,1);
            PriceList obj = new PriceList(null,null,-1,-1);
            obj.set("Об'єкт","Тип",100,10);
            folder.show();
            paper.show();
            calc.show();
            obj.set("Об'єкт","Тип",100,10);
            obj.show();
            obj.get();
        }
    }

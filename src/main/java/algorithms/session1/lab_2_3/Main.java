package algorithms.session1.lab_2_3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;



public class Main implements Serializable{
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        StackControl mainController = null;
        boolean exit = true;
        while (exit) {
            System.out.println("1.\tСоздать стэк");
            System.out.println("2.\tДобавление элемента в стэк");
            System.out.println("3.\tУдаление элемента");
            System.out.println("4.\tПроверка на переполнение");
            System.out.println("5.\tПроверка на пустоту");
            System.out.println("6.\tОтобразить стэк");
            System.out.println("7.\tУничтожить стэк");
            System.out.println("8.\tSwap – поменять местами два верхних элемента");
            System.out.println("9.\t Exit");
            try {
                switch (sc.nextInt()) {
                    case 1: {
                        System.out.println("Введите размер");
                        mainController = new StackControl(sc.nextInt());
                        System.out.println("Какой использовать тип массива?");
                        System.out.println("1.Динамический\n 2.Статический");
                        if(1 == sc.nextInt())
                            mainController.setUpdateArray(true);
                    }
                    case 2: {
                        System.out.println("Введите число");
                        mainController.push(sc.nextInt());
                        break;
                    }
                    case 3: {
                        mainController.pop();
                        break;
                    }
                    case 4: {
                        System.out.println(mainController.isFull());
                        break;
                    }
                    case 5: {
                        System.out.println(mainController.isEmpty());
                        break;
                    }
                    case 6:
                        System.out.println(Arrays.toString(mainController.getStackArr()));
                        break;
                    case 7:
                        mainController.clear();
                        break;
                    case 8:
                        mainController.swap();
                        break;

                    default: exit=false;
                }
            } catch (Exception e) {
                System.out.println("try again");
                e.printStackTrace();
            }
        }
    }
}













/**
 *  Thx kasad0r for a help <3
 **/
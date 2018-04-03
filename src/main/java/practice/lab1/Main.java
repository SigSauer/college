package practice.lab1;

import java.util.Scanner;

//Меню виклику методу по вирішенню відповідного завдання
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.println("Input index of task: ");
            switch (sc.nextInt()) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                default:
                    break;

            }
        }
    }

    //Завдання 1
    public static void task1() {
        System.out.println("Введіть координати точки \nx:");
        double x = sc.nextDouble();
        System.out.println("y: ");
        double y = sc.nextDouble();
        if((x<1 && x>-1) && (y < 1 && y > 0) && (x<0 || x*x+y*y <= 1)) {
            System.out.println("Точка ("+x+", "+y+") потрапляє в задану область ");
        }
        else {
            System.out.println("Точка ("+x+", "+y+") не потрапляє в задану область ");
        }
    }

    //Завдання 2
    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть індекс високосного року та номер місяця: ");
        int ind = sc.nextInt();
        if(ind == 1 || ind == 0) {
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Січень: 31");
                    break;
                case 2:
                    if(ind == 1) {
                        System.out.println("Лютий: 29");
                        break;
                    }
                    else  {
                        System.out.println("Лютий: 28");
                        break;
                    }
                case 3:
                    System.out.println("Березень: 31");
                    break;
                case 4:
                    System.out.println("Квітень: 30");
                    break;
                case 5:
                    System.out.println("Травень: 31");
                    break;
                case 6:
                    System.out.println("Червень: 30");
                    break;
                case 7:
                    System.out.println("Липень: 31");
                    break;
                case 8:
                    System.out.println("Серпень: 31");
                    break;
                case 9:
                    System.out.println("Вересень: 30");
                    break;
                case 10:
                    System.out.println("Жовтень: 31");
                    break;
                case 11:
                    System.out.println("Листопад: 30");
                    break;
                case 12:
                    System.out.println("Грудень: 31");
                    break;
                default:
                    System.out.println("Помилка вхідних даних");
                    break;
            }
        }
        else {
            System.out.println("Помилка вхідних даних");
        }
    }
}

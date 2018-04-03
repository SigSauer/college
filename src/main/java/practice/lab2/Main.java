package practice.lab2;

import java.util.Scanner;
import static java.lang.Math.*;

//Меню виклику методу по вирішенню відповідного завдання
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Input index of task: ");
            switch (sc.nextInt()) {
                case 1:
                    task01();
                    break;
                case 2:
                    task02();
                    break;
            }
        }
    }

    //Завдання 1
    private static void task01() {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("i = "+ i + " : " + func(i));
            sum += func(i);
        }
        System.out.println("Сума = " + sum);
    }


    private static double func(int n) {
        return (Math.pow(-1,n) * (1 - (Math.pow(n,2) + 1)/(Math.pow(n,2)+3)));
    }

    //Завдання 2
    private static void task02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input \"a\" and \"x\" for \"t1\"");
        System.out.println("t1 = "+t1Func(sc.nextInt(),sc.nextInt()));
        System.out.println("Input \"a\", \"b\" and \"x\" for \"t2\"");
        System.out.println("t2 = "+t2Func(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }

    private static double t1Func(int x, int a) {
        return (1/6*pow(a,3))*log((a+x)/(a-x))+(1/2*pow(a,3));
    }

    private static double t2Func(int a,int b,  int x) {
        return (1/a*b)*log((tan(a*x+b)/(tan(a*x-b))));
    }
}

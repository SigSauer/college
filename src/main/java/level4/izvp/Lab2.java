package level4.izvp;

import java.util.Scanner;
import static java.lang.Math.*;

public class Lab2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Lab2 lab2 = new Lab2();
        lab2.task6();

    }

    public void task6() {
        // 1chain = 30.38 m = 1 fount
        System.out.println("Input start value");
        int startValue = sc.nextInt();
        System.out.println("Input delta");
        int delta = sc.nextInt();
        System.out.println("Count of values");
        int count = sc.nextInt();
        System.out.println("chains\tmeters\tfount");
        for (int i = startValue, c = 0; c <= count; i+=delta, c++) {
            System.out.println(i+"\t"+30.48*i+"\t"+100*i);
        }
    }

    public void task7() {
        double a = 0, b = 1;
        for (int i = 17; i < 23; i++) {
            a+=func22(i);
        }
        for (int i = 17; i < 25; i++) {
            b*=func23(i);
        }
        System.out.println("Z = "+(4*b*a-b));
    }

    public void task8() {

    }

    public double func22(double x) {
        return 2*sin(abs(2*x))*cos(2*x)-11.6*sin(x/0.4-1);
    }

    public double func23(double x) {
        return sin(abs(x))/0.1 +9.4*sin(3*x-2.5);
    }

    public double func24(double x) {
        return 10.8*abs(cos(x*x/1.13))*sin(x+1.14);
    }

    public double factorial(double x) {
        return 0;
    }
}

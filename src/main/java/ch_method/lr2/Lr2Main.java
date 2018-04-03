package ch_method.lr2;

import java.util.Scanner;

import static java.lang.Math.exp;
import static java.lang.StrictMath.log;

public class Lr2Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введіть межі : ");
        double x0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        System.out.println("Введіть похибку: ");
        double epsilon = sc.nextDouble();
        System.out.println("Метод хорд: ");
        System.out.println("З точністю " + epsilon + ": " + methodChord(x0,x1,epsilon));
        System.out.println();
        System.out.println("Метод Ньютона: ");
        System.out.print("З точністю " + epsilon + ": ");
        methodN(x0,x1,epsilon);
            }

    private static double methodChord (double x_prev, double x_curr, double e) {
        double x_next = 0;
        double tmp;
        while (Math.abs(x_next - x_curr) > e){
            tmp = x_next;
            x_next = x_curr - f(x_curr) * (x_prev - x_curr) / (f(x_prev) - f(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        }
        return x_next;
    }

    public static void methodN(double x1, double x2, double h) {

        if (f(x1) * shtrih(x1,h) <= 0) {
            calc(x1);
        }else{
            calc(x2);
        }
    }
    private static void calc(double x){
        double eps = 0.001;
        double f = (exp(x)+log(x)-10*x) / (exp(x)+1/x - 10);
        if(f > eps){
            calc(x - f);
        } else{
            System.out.println("x = " + x);
        }
    }

    private static double shtrih(double x, double h){
        return (f(x + h) - f(x)) / h;
    }

    private static double f (double x){
        return 3 * Math.sin(8 * x) - 0.7 * x  - 0.9;
    }
}


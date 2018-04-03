package ch_method.lr11;

import java.util.Scanner;

public class Lr11Main {
    private static int n = 100;
    private static double x[] = new double[n];
    private static double h = 0.1;

    public double function(double X, double Y) {
        return X + Math.sin(Y/Math.PI);
    }

    public double metodEllera(double X, double Y) {
        double M = Y + h * function(X, Y);
        return M;
    }

    public void tablichka(double A, double B) {
        double a = A;
        double b = B;
        double c = 0;
        for (double j = a; j < b; j += h) {
            c++;
        }
        double y = 1.7d;
        double y1;
        x[0] = A;
        System.out.println("x: " + x[0] + "||y: " + y + "||F: " + function(x[0], y) + "||h*F: " + h * function(x[0], y));
        for (int i = 1; i <= c; i++) {
            x[i] = x[i - 1] + h;
            y1 = metodEllera(x[i], y);
            System.out.println("x: " + x[i] + "||y: " + y1 + "||F: " + function(x[i], y1) + "||h*F: " + h * function(x[i], y1));
            y = y1;
        }


    }

    public void tablichka2(double A, double B) {
        double a = A;
        double b = B;
        double c = 0;
        double y = 0.7d;
        double y1;
        for (double j = a; j < b; j += h) {
            c++;
        }
        x[0] = A;
        System.out.println("x: " + x[0] + " |X: " + xshtrh(0) + " |k1: " + k1(0, y) + " |k2: " + k2(0, y) + " |k3: " + k3(0, y) + " |k4: " + k4(0, y) + " |y: " + y);
        for (int i = 1; i <= c; i++) {
            x[i] = x[i - 1] + h;
            y1 = igr(i - 1, y);
            System.out.println("x: " + x[i] + " |X: " + xshtrh(i) + " |k1: " + k1(i, y) + " |k2: " + k2(i, y) + " |k3: " + k3(i, y) + " |k4: " + k4(i, y) + " |y: " + y1);
            y = y1;
        }

    }

    public double xshtrh(int n) {
        double X;
        if (n == 0) X = 0;
        else X = x[n] + ((x[n] + x[n - 1]) / 2);
        return X;
    }

    public double k1(int n, double Y) {
        double k1 = function(x[n], Y);
        return k1;
    }

    public double k2(int n, double Y) {
        double k2 = function(xshtrh(n), Y + k1(n, Y) / 2);
        return k2;
    }

    public double k3(int n, double Y) {
        double k3 = function(xshtrh(n), Y + k2(n, Y) / 2);
        return k3;
    }

    public double k4(int n, double Y) {
        double k4 = function(2 * xshtrh(n), Y + k3(n, Y));
        return k4;
    }

    public double igr(int n, double Y) {
        double Z = Y + (k1(n, Y) + 2 * k2(n, Y) + 2 * k3(n, Y) + k4(n, Y)) * 0.06 / 6;


        return Z;
    }

    public static void main(String[] args) {
        Lr11Main main = new Lr11Main();
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        main.tablichka(A, B);
        main.tablichka2(A, B);


    }
}

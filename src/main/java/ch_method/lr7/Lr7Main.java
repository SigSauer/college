package ch_method.lr7;

import java.util.Scanner;

public class Lr7Main {
    private static int z=100;
    private static double c = 0;
    private static double x[]={-4,0,2};
    private static double y[]={4,8,-2};
    private static double x1[]=new  double[z];
    private static double y1[]=new  double[z];
    private static int n=3;
    private static double h=0.01;
    private static double dy[][]=new double[z][z];
    public double tochkyF(double X){
        double Y=0;
        double m=1;
        double l;
        double l1;
        double m1=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if(j==i){l=1;l1=1;}
                else {l=(X-x[j]);l1=(x[i]-x[j]);}
                m*=l;
                m1*=l1;
            }
            m=(X-m)*(X-m1);
            m1=(x[i]-m)*(x[i]-m1);
            Y+=(y[i]*(m/m1));
        }
        return Y;
    }
    public double derivative(double X){
        double Y=(tochkyF(X+3*h)-3*tochkyF(X+2*h)+3*tochkyF(X+h)-tochkyF(X))/(h*h);
        return Y;
    }
    public double pohybka(double X){
        double Y= derivative(X)/2;
        double l;
        for (int i = 0; i < n; i++) {
            l=(X-x[i]);
            if (l!=0)Y*=l;
        }
        return Y;
    }
    public double interN(double A,double B){
        double a = A;
        double b = B;
        for (double j = a ; j < b; j+=h) {

            c++;
        }
        for (int i = 0; i <c; i++) {
            x1[i]=A;
            y1[i]=tochkyF(x1[i]);
            A+=h;
        }
        return c;
    }
    public double methodNewton(double X, int n){
        double p=1;
        double t=1;
        double dod;
        double f=0;
        for (int i = 0; i < n-1; i++) {
            dy[i][0]=y1[i+1]-y1[i];
        }
        for (int j = 1; j < n-1; j++) {
            for (int i = 0; i < n-1; i++) {
                dy[i][j] = dy[i + 1][j-1] - dy[i][j-1];
            }
        }
        for (int i = 1; i < n; i++) {
            p*=i;
            t*=(X-x1[i-1])/Math.pow(h,i);
            dod=(t/p)*dy[0][i];
            f+=dod;
        }
        return f;
    }
    public static void main(String[] args) {
        Lr7Main main = new Lr7Main();
        Scanner scanner = new Scanner(System.in);
        double X=scanner.nextDouble();
        System.out.println(main.pohybka(X));
        System.out.println("__________________________________");
        double A=scanner.nextDouble();
        double B=scanner.nextDouble();
        System.out.println(main.methodNewton(X,(int)main.interN(A,B)));

    }
}



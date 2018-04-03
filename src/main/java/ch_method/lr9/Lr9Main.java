package ch_method.lr9;

import java.util.Scanner;

strictfp public class Lr9Main {
    private static double x[]={1.5f,2,2.5f,3,3.5f,4,4.5f,5,5.5f,6,6.5f,7};
    private static double y[]={10.517f,10.193f,9.807f,9.387f,8.977f,8.637f,8.442f,8.482f,8.802f,9.701f,11.132f,13.302f};
    private static double f = y[0];
    private double h = x[1]-x[0];
    private static double dy[][]=new double[100][100];
    private double t=1;
    private double dod;
    private int p=1;
    public  double metod1(double X, int n){
        for (int i = 0; i < n-1; i++) {
            dy[i][0]=y[i+1]-y[i];
        }
        for (int j = 1; j < n-1; j++) {
            for (int i = 0; i < n-1; i++) {
                dy[i][j] = dy[i + 1][j-1] - dy[i][j-1];
            }
        }
        for (int i = 1; i < n; i++) {
            p*=i;
            t*=(X-x[i-1])/Math.pow(h,i);
            dod=(t/p)*dy[0][i];
            f+=dod;
        }
        return f;
    }
    public double metodF(double X,int n){
        return (metod1(X,n)-metod1(X,n-1))/h;
    }
    public double mSIN(double X){
        return Math.pow(X,2) + Math.log(X);
    }
    public void metodAB(int N,double a,double b){
        double x1[]= new double[N];
        double y1[]= new double[N];
        h=(b-a)/N;
        x1[0]=a;
        for (int i = 0; i < N-1; i++) {
            x1[i+1]=x1[i]+h;
            y1[i]=mSIN(x1[i])+x1[i];
        }
        double k;
        double I;
        for (int j = 0; j <5; j++) {
            I = 0;
            k = 0;
            for (int i = 0; i <= N - 1; i++) {
                if (((N - 1) == (i + 1))) break;
                if (j == 0) k = y1[i + 1];
                if (j == 2) k = (y1[i] + y1[i + 1]) / 2;
                if (j == 3) k = (mSIN((x1[i+1] + x1[i+2]) / 2))+x1[i];
                if (j == 1) k = y1[i];
                I += k;
            }
            if (j == 4) {
                double parn=0;
                double nparn=0;
                h /= 3;
                for (int i = 1; i <= N-1; i ++) {
                    if(i%2==0)parn+=y1[i];
                    else nparn+=y1[i];
                }
                I = y1[0] +2 * parn + 4 * nparn+ y1[N-1];
            }
            I *= h;
            System.out.println(I);
        }


    }
    public static void main(String[] args) {
        Lr9Main main = new Lr9Main();
        Scanner scanner = new Scanner(System.in);
        double X=scanner.nextDouble();
        System.out.println(main.metodF(X,12));
        System.out.println("____________________________");
        double N=scanner.nextDouble();
        double A=scanner.nextDouble();
        double B=scanner.nextDouble();

        main.metodAB((int)N,A,B);
    }
}


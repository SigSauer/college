package teor;

import java.util.Scanner;

public class Lr7Main3 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input p: ");
        double p = sc.nextDouble();
        int z;
        System.out.println("input n: ");
        int n = sc.nextInt();
        table(p, n);
    }

    private static void table(double pp, int nn) {
        double qq = 1 - pp;
        System.out.println("n = "+nn);
        System.out.println("p = "+pp);
        System.out.println("q = "+qq);
        for (int i = 1; i <= nn; i++) {
            System.out.println(i+": "+(C(i,nn)*qq*Math.pow(pp,i)));
        }
        System.out.println("M(x) = "+ nn/pp);
        System.out.println("D(X) = "+ nn/(pp*pp));
        double sigma = Math.sqrt(nn/(pp*pp));
        System.out.println("sigma = "+sigma);
        characteristic(pp,nn,sigma);
    }

    private static void characteristic(double pp, int nn, double s) {
        double[] nyu = new double[] {0, 0, 0, 0};
        double myu1, myu2, myu3;
        double qq = 1 - pp;
        for (int i = 1; i <= nyu.length; i++) {
            for (int j = 1; j <= nn; j++) {
                nyu[i-1] += (C(j,nn)*qq*Math.pow(pp,j))*Math.pow(j,i);

            }
            System.out.println("nyu"+i+" = "+nyu[i-1]);
        }
        myu1 = nyu[1] - nyu[0]*nyu[0];
        System.out.println("myu1 = "+myu1);
        myu2 = nyu[2] - 3*nyu[1]*nyu[0]+Math.pow(nyu[0],3)*2;
        System.out.println("myu2 = "+myu2);
        int i = -999;
        myu3 = nyu[3] - 4*nyu[0]*nyu[2]+ 6 * nyu[1]*nyu[0]*nyu[0] - 3* Math.pow(nyu[1],4);
        System.out.println("myu3 = "+myu3);
        double As = myu2/Math.pow(s,3);
        double Es = myu3/Math.pow(s,4);
        System.out.println("As = "+As+"\nEs = "+Es);
    }

    private static int C(int k, int n) {
        return  fact(n)/(fact(k)*fact(n-k));
    }

    private static int fact(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}

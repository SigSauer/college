package teor;

import java.util.Scanner;

public class Lr7main {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input p: ");
        double p = sc.nextDouble();
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
            System.out.println(i+": "+pp*Math.pow(qq,i-1));
        }
        System.out.println("M(x) = "+ 1/pp);
        System.out.println("D(X) = "+ qq/(pp*pp));
        double sigma = Math.sqrt(qq/(pp*pp));
        System.out.println("sigma = "+sigma);
        characteristic(pp,nn,sigma);
    }

    private static void characteristic(double pp, int nn, double s) {
        double[] nyu = new double[] {0, 0, 0, 0};
        double myu1, myu2, myu3;
        double qq = 1 - pp;
        for (int i = 1; i <= nyu.length; i++) {
            for (int j = 1; j <= nn; j++) {
                nyu[i-1] += pp*Math.pow(qq,j-1)*Math.pow(j,i);

            }
            System.out.println("nyu"+i+" = "+nyu[i-1]);
        }
        myu1 = nyu[1] - nyu[0]*nyu[0];
        System.out.println("myu1 = "+myu1);
        myu2 = nyu[2] - 3*nyu[1]*nyu[0]+Math.pow(nyu[0],3)*2;
        System.out.println("myu2 = "+myu2);
        myu3 = nyu[3] - 4*nyu[0]*nyu[2]+ 6 * nyu[1]*nyu[0]*nyu[0] - 3* Math.pow(nyu[1],4);
        System.out.println("myu3 = "+myu3);
        double As = myu2/Math.pow(s,3);
        double Es = myu3/Math.pow(s,4);
        System.out.println("As = "+As+"\nEs = "+Es);
    }
}

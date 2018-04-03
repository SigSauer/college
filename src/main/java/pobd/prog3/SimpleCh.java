package pobd.prog3;

import java.util.Scanner;


public class SimpleCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Choose index of menu: \n" +
                    "1. Finding of simple ch on static counter \n" +
                    "2. Finding of simple ch \n" +
                    "3. \n" +
                    "4. ");
            switch (sc.nextInt()) {
                case 1: simpleChSC(); break;
                case 2: simpleCh(); break;
            }
        }
    }


    private static void simpleChSC() {
        Scanner sc = new Scanner(System.in);
        boolean end = true;
        while (end) {
            System.out.println("Input count of simple ch");
            int n = sc.nextInt();
            int count = 0;
            long timeBegin = System.currentTimeMillis();
            for (int i = 1;count <= n; i++) {
                int c = 0;
                for (int j = 1; j <= i; j++)
                    if (i % j == 0) c++;
                if (c == 2) {
                    count++;
                    System.out.println(i);
                }
            }
            System.out.println("Time: " + (System.currentTimeMillis() - timeBegin) + " ms");
            end = false;
            }
        }

        private static void simpleCh() {
            Scanner sc = new Scanner(System.in);
            boolean end = true;
            while (end) {
                int count = 0;
                System.out.println("Input diapason [a;b]");
                System.out.println(" a: ");
                int a = sc.nextInt();
                System.out.println(" b: ");
                int b = sc.nextInt();
                long timeBegin = System.currentTimeMillis();
                for (int i = a;i <= b; i++) {
                    int c = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) c++;
                    }
                    if (c == 2) {
                        count++;
                        System.out.println(i);
                    }
                }
                System.out.println("count of simple ch: ");
                System.out.println("Time: " + (System.currentTimeMillis() - timeBegin) + " ms");
                end = false;
            }
    }

}

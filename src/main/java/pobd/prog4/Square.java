package pobd.prog4;

import java.util.Scanner;

public class Square {
    private static int value = 314159265;
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while (true) {
            System.out.println("Input square: ");
            int square = sc.nextInt();
            long start = System.currentTimeMillis();
            for (int i = 1; i <= square; i++) {
                if (square % i == 0) {
                    if(square / i == value) {
                        break;
                    }
                    System.out.println("a = " + square / i + ", b = " + i);
                    value = i;
                }
            }
            System.out.println(System.currentTimeMillis() - start);
        }
    }
}

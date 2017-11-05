package study.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *     Created by SigSauer
 */

public class Main {
    private static ArrayList<Service> service = new ArrayList<Service>();

    public static void main(String[] args) {
        Main main = new Main();
       main.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (exit) {
            System.out.println("Select index of menu: ");
            System.out.println("1. Add to list");
            System.out.println("2. Delete from");
            System.out.println("3. Find a human");
            System.out.println("4. Get all list");
            System.out.println("5. Delete all list");
            System.out.println("6. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }

    }
}

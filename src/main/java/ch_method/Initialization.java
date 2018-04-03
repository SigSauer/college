package ch_method;

import ch_method.lr11.Lr11Main;
import ch_method.lr2.Lr2Main;
import ch_method.lr7.Lr7Main;
import ch_method.lr8.Lr8Main;
import ch_method.lr9.Lr9Main;

import java.util.Scanner;

public class Initialization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lr2Main main2 = new Lr2Main();
        Lr7Main main7 = new Lr7Main();
        Lr8Main main8 = new Lr8Main();
        Lr9Main main9 = new Lr9Main();
        Lr11Main main11 = new Lr11Main();
        boolean exit = true;
        while(exit) {
            System.out.println("Input index of menu");
            System.out.println(
                            "0. Exit \n"+
                            "1. lr2 \n" +
                            "2. lr7 \n" +
                            "3. lr8 \n" +
                            "4. lr9 \n" +
                            "5. lr11");
            switch (scanner.nextInt()) {
                case 0:
                    exit = false;
                case 1:
                    main2.main(null);
                    break;
                case 2:
                    main7.main(null);
                    break;
                case 3:
                    main8.main(null);
                    break;
                case 4:
                    main9.main(null);
                    break;
                case 5:
                    main11.main(null);
                    break;
            }
        }
    }
}

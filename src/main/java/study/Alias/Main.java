package study.Alias;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *      Created by SigSauer
 */

public class Main {
    private static ArrayList<Words> wordlist = new ArrayList<Words>();

    public static void main(String[] args) {
        Main main = new Main();

        main.menu();
        main.getAllWords();
    }

    private void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Welcome to Alias Console Game (Created by SigSauer on 05.11.2017)");
            System.out.println("The ACG under alpha-testing: You can delete words, which are EBANIENAHUY to your opinion,");
            System.out.println("using \"del\" command");
            System.out.println("Choose one of the options:");
            System.out.println("1. Loading");
            System.out.println("2. Start game (Not working)");
            System.out.println("3. Print all words");
            System.out.println("4. Exit \n");
                switch (sc.nextInt()) {
                    case 1:
                        reading();
                        break;
                    case 2:
                        game();
                        break;
                    case 3:
                        getAllWords();
                        break;
                    case 4:
                        System.out.println("Thank you for the game =)");
                        exit = false;
                        break;
                    default: {
                        System.out.println("Wrong index of the options =(");
                        System.out.println("Try again");
                        break;
                    }
                }


        }
    }

    private void add(String[] dbword) {
        for (int i = 0; i < dbword.length; i++) {
            wordlist.add(addWords(i,dbword));
        }
        System.out.println("The game are ready");
    }


    private Words addWords(int iter, String[] wordsname) {
        Words word = new Words();
        word.setCodeword(iter);
        word.setWord(wordsname[iter]);
        return word;
    }

    private void getAllWords() {
        for (int i = 0; i < wordlist.size(); i++) {
            System.out.println(i+": "+wordlist.get(i));
        }
    }
    
    private void reading() {
        Scanner sc = new Scanner(System.in);
        String[] wordS = new String[34009];
        System.out.println("run:");
        for (int i = 0; i <= wordS.length ; i++) {
            try {
                wordS[i] = sc.nextLine();
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
        }
        add(wordS);
    }

    private void game(){

    }
}

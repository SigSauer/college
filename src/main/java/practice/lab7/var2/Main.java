package practice.lab7.var2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    private static List<Admin> adminList = new ArrayList<>();
    private static List<Marriage> marriageList = new ArrayList<>();


    public static void main(String[] args) {
        new Main().menu();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Введіть номер пункту");
            System.out.println("1. Адміністратор" +
                    "\n2. Приймання заяв" +
                    "\n3. Одруження" +
                    "\n4. Вихід з програми");
            switch (sc.nextInt()) {
                case 1:
                    adminControl();
                    break;
                case 2:
                    appFormControl();
                    break;
                case 3:
                    marriageControl();
                    break;
                case 4:
                    exit = false;
                    break;
            }
        }
    }

    private void adminControl(){
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Введіть номер пункту");
            System.out.println( "1. Додати персонал" +
                                "\n2. Вивести список персоналу" +
                                "\n3. Знайти за ПІБ" +
                                "\n4. Знайти за місцем роботи" +
                                "\n5. Назад");
            switch (sc.nextInt()) {
                case 1:
                    addToAdmin();
                    break;
                case 2:
                    showStaffList();
                    break;
                case 3:
                    findStaffByName();
                    break;
                case 4:
                    findStaffByControl();
                    break;
                case 5:
                    menu();
            }
        }
    }

    private void appFormControl() {
        new AFControl().menuAF();
    }

    private void marriageControl() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Введіть номер пункту");
            System.out.println( "1. Нове одруження" +
                                "\n2. Вивести все" +
                                "\n3. Назад");
            switch (sc.nextInt()) {
                case 1:
                    addMarriage();
                    break;
                case 2:
                    showMarriageList();
                    break;
                case 3:
                    menu();
                    break;
            }
        }
    }

    private void addToAdmin() {
        adminList.add(createStaff());
    }

    private Admin createStaff() {
        Scanner sc = new Scanner(System.in);
        Admin a = new Admin();
        try {
            System.out.println("Введіть ПІБ робітника");
            a.setStaffFullname(sc.nextLine());

            System.out.println("Введіть місце роботи (1 - Прийом заяв, 2 - Одруження)");
            a.setControl(sc.nextInt());

            a.setStaffId((int) (a.getStaffFullname().length()*PI + (random()*5)*a.getControl()));
        } catch (Exception e) {
            System.out.println("Помилка вводу");
            createStaff();
        }
        return a;
    }

    private void showStaffList() {
        for (Admin a : adminList) {
            a.showAdmin();
        }
    }

    private void findStaffByControl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть місце контролю");
        int wp = sc.nextInt();
        if (wp != 0 && wp != 1) {
            System.out.println("Тільки 1 чи 0 !");
            findStaffByControl();
        } else {
            for (Admin a : adminList) {
                if(wp == a.getControl()) {
                    a.showAdmin();
                }
            }
        }
    }


    private void findStaffByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ПІБ");
        String name = sc.nextLine();
        for (Admin a : adminList) {
            if (a.getStaffFullname().toLowerCase().contains(name.toLowerCase())) {
                a.showAdmin();
            }
        }
    }

    private void addMarriage() {
        marriageList.add(createMarriage());
    }

    private Marriage createMarriage() {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Marriage m = new Marriage();
        try {
            System.out.println("Введіть ПІБ чоловіка: ");
            m.setFullnameOfMale(sc.nextLine());

            System.out.println("Введіть ПІБ дружини: ");
            m.setFullnameOfFemale(sc.nextLine());

            System.out.println("Введіть вік дружини");
            m.setAgeOfMale(scan.nextInt());

            System.out.println("Введіть вік дружини");
            m.setAgeOfFemale(scan.nextInt());

            System.out.println("Введіть дату укладання шлюбу: ");
            m.setDateOfMerriage(sc.nextLine());

            System.out.println("Введіть змінене призвище дружини: ");
            m.setNewSurnameByFemale(sc.nextLine());

            System.out.println("Введіть змінене призвище чоловіка: ");
            m.setNewSurnameByMale(sc.nextLine());
        }catch (Exception e) {
            System.out.println("Помилка вводу");
            createMarriage();
        }
        return m;
    }

    private void showMarriageList() {
        for (Marriage m : marriageList) {
            m.showMerriage();
        }
    }
}

package practice.lab7.var2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.PI;

public class AFControl {
    private static List<AppForm> appformList = new ArrayList<>();

    public void menuAF() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть номер пункту");
        System.out.println( "1. Додати заяву" +
                            "\n2. Вивести всі заяви" +
                            "\n3. Вивести всі заяви заданого типу" +
                            "\n4. Знайти заяву за вибором" +
                            "\n5. Назад");
        switch (sc.nextInt()) {
            case 1:
                addAppForm();
                break;
            case 2:
                outputAppForm();
                break;
            case 3:
                outputByType();
                break;
            case 4:
                findByChoose();
                break;
            case 5:
                new Main().menu();
                break;
        }


    }

    private void addAppForm() {
        appformList.add(addGeneralForm());
    }

    private AppForm addGeneralForm() {
        Scanner scInt = new Scanner(System.in);
        Scanner scLine = new Scanner(System.in);
        AppForm af = new AppForm();
        try {
            System.out.println("Введіть ПІБ заявника: ");
            af.setFullname(scLine.nextLine());

            System.out.println("Введіть дату народження заявника: ");
            af.setDateOfTheBirth(scLine.nextLine());

            System.out.println("Введіть тип заяви: ");
            System.out.println( "*: 1 - Заява на реєістрацію народження" +
                                "\n   2 - Заява на реєістрацію смерті" +
                                "\n   3 - Заява на укладання шлюбу\n");
            af.setTypeOfForm(scInt.nextInt());

            System.out.println("Введіть дату створення заяви: ");
            af.setDateOfForm(scLine.nextLine());

            af.setAppFormId((int) (af.getFullname().length() + PI * (af.getFullname().length() - af.getTypeOfForm())));
        } catch (Exception e) {
            System.out.println("Помилка вводу");
            addGeneralForm();
        }

        switch (af.getTypeOfForm()) {
            case 1:
                addBDayForm(af);
                break;
            case 2:
                addDeathForm(af);
                break;
            case 3:
                addMerriageForm(af);
                break;
        }
        return af;
    }

    private void addBDayForm(AppForm a) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введіть ім'я дитини: ");
            a.setNameOfChild(sc.nextLine());

            System.out.println("Введіть призвище дитини: ");
            a.setSurnameOfChild(sc.nextLine());

            System.out.println("Введіть ім'я батька: ");
            a.setNameOfDad(sc.nextLine());

            System.out.println("Введіть ім'я матері: ");
            a.setNameOfMom(sc.nextLine());

            System.out.println("Введіть дату народження дитини: ");
            a.setDayOfBirth(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Помилка вводу");
            addBDayForm(a);
        }
    }

    private void addDeathForm(AppForm a) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введіть ПІБ людини: ");
            a.setFullnameOfDeath(sc.nextLine());

            System.out.println("Введіть стать: ");
            a.setSexOfDeath(sc.nextLine());

            System.out.println("Введіть вік: ");
            a.setAgeOfDeath(sc.nextLine());

            System.out.println("Введіть дату смерті: ");
            a.setDateOfDeath(sc.nextLine());

            System.out.println("Введіть причину смерті: ");
            a.setCauseOfDeath(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Помилка вводу");
            addBDayForm(a);
        }
    }

    private void addMerriageForm(AppForm a) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введіть ПІБ чоловіка: ");
            a.setFullnameOfMale(sc.nextLine());

            System.out.println("Введіть ПІБ дружини: ");
            a.setFullnameOfFemale(sc.nextLine());

            System.out.println("Введіть дату укладання шлюбу: ");
            a.setDateOfMerriage(sc.nextLine());

            System.out.println("Введіть змінене призвище дружини: ");
            a.setNewSurnameByFemale(sc.nextLine());

            System.out.println("Введіть змінене призвище чоловіка: ");
            a.setNewSurnameByMale(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Помилка вводу");
            addMerriageForm(a);

        }
    }

    private void outputAppForm() {

        for (AppForm af : appformList) {
            af.showAppForm();
        }
    }

    private void outputByType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть індекс типу");
        int type = sc.nextInt();
        for (AppForm af : appformList) {
            if (type == af.getTypeOfForm()) {
                af.showAppForm();
            }
        }
    }

    private void findByChoose() {
        Scanner sc = new Scanner(System.in);
        System.out.println( "1. ...за ПІБ заявника" +
                            "\n2. ...за датой заяви" +
                            "\n3. ...за ПІБ у заяві");
        switch (sc.nextInt()) {
            case 1:
                findByName();
                break;
            case 2:
                findByDate();
                break;
            case 3:
                findByNameAF();
                break;
        }
        menuAF();
    }

    private void findByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ПІБ заявника");
        String name = sc.nextLine();
        for (AppForm af : appformList) {
            if (af.getFullname().toLowerCase().contains(name.toLowerCase())) {
                af.showAppForm();
            }
        }
    }

    private void findByDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть дату заяви");
        String date = sc.nextLine();
        for (AppForm af : appformList) {
            if (af.getDateOfForm().toLowerCase().contains(date.toLowerCase())) {
                af.showAppForm();
            }
        }
    }

    private void findByNameAF() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ПІБ у заяві");
        String fullname = sc.nextLine();
        for (AppForm af : appformList) {
            if (af.getFullnameOfDeath().toLowerCase().contains(fullname.toLowerCase()) || af.getFullnameOfFemale().toLowerCase().contains(fullname.toLowerCase())
                    || af.getFullnameOfFemale().toLowerCase().contains(fullname.toLowerCase())
                    || (af.getNameOfChild()+" "+af.getSurnameOfChild()).toLowerCase().contains(fullname.toLowerCase())
                    || (af.getNameOfDad()+" "+af.getSurnameOfChild()).toLowerCase().contains(fullname.toLowerCase())
                    || (af.getNameOfMom()+" "+af.getSurnameOfChild()).toLowerCase().contains(fullname.toLowerCase())) {
                af.showAppForm();
            }
        }
    }

}

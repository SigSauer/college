package practice.lab6;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    private static List<Appliances> appliancesList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            Main main = new Main();
            System.out.println("\n1. Додати техніку");
            System.out.println("2. Знайти за типом");
            System.out.println("3. Знайти за ціною");
            System.out.println("4. Знайти за компанією");
            System.out.println("5. Вийти");
            switch ((sc.nextInt())) {
                case 1:
                    main.addToList();
                    break;
                case 2:
                    System.out.println("Введіть тип");
                    main.findByType(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Введіть ціну");
                    main.findByPrice(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Введіть компанію");
                    main.findByCompany(sc.nextLine());
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Помилка вводу");
                    break;
            }
        }
    }

    private void addToList() {
        appliancesList.add(createAppliances());
    }

    private Appliances createAppliances() {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Appliances ap = new Appliances();
        try {
            System.out.println("Введіть номер: ");
            ap.setNumber(scan.nextInt());

            System.out.println("Введіть тип: ");
            ap.setType(sc.nextLine());
            System.out.println();

            System.out.println("Введіть модель: ");
            ap.setModel(sc.nextLine());
            System.out.println();

            System.out.println("Введіть назву: ");
            ap.setName(sc.nextLine());
            System.out.println();

            System.out.println("Введіть фірму: ");
            ap.setCompany(sc.nextLine());
            System.out.println();

            System.out.println("Введіть кількість: ");
            ap.setQuantity(scan.nextInt());
            System.out.println();

            System.out.println("Введіть ціну: ");
            ap.setPrice(scan.nextInt());
            System.out.println();

            System.out.println("Введіть дату виготовлення: ");
            ap.setDateOfProduction(sc.nextLine());
            System.out.println();

            System.out.println("Введіть строк гарантії: ");
            ap.setWarrantyPeriod(scan.nextInt());
            System.out.println();

        } catch (Exception e) {
            System.out.println("Помилка вводу");
            createAppliances();
        }
        return ap;
    }

    private void findByType(String t) {
        System.out.println("Побутова техніка: \n");
        for(Appliances a: appliancesList) {
            if(a.getType().toLowerCase().contains(t.toLowerCase())) {
                a.show();
            }
        }
    }

    private void findByPrice(double price) {
        System.out.println("Побутова техніка: \n");
        for (Appliances a : appliancesList) {
            if (a.getPrice() <= price) {
                a.show();
            }
        }
    }

    private void findByCompany(String c) {
        System.out.println("Побутова техніка: \n");
        for(Appliances a: appliancesList) {
            if(a.getType().toLowerCase().contains(c.toLowerCase())) {
                a.show();
            }
        }
    }

}

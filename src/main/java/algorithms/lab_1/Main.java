package algorithms.lab_1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *  Created by SigSauer
 */

public class Main {
    private static List<Employee> objectList = new ArrayList<Employee>();

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            Main main = new Main();
            System.out.println("\n1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Find");
            System.out.println("4.Add To Middle");
            System.out.println("5.Add by Index");
            System.out.println("6.Get All List");
            System.out.println("7.Exit");
            System.out.println("8.Delete All\n");
            switch ((sc.nextInt())) {
                case 1:
                    main.add();
                    break;
                case 2:
                    main.delete();
                    break;
                case 3:
                    main.find();
                    break;
                case 4:
                    main.addToMiddle();
                    break;
                case 5:
                    main.addByIndex();
                    break;
                case 6:
                    main.getAllList();
                    break;
                case 7:
                    exit = false;
                    break;
                case 8:
                    objectList.clear();
                    break;
                default:
                    System.out.println("Wrong index of menu:");
                    break;
            }
        }
    }

    private void delete() {
        if (objectList.size() > 0) {
            getAllList();
            System.out.print("Select index: ");
            Scanner sc = new Scanner(System.in);
            int indexToDel = sc.nextInt();
            System.out.println();
            try {
                System.out.println(objectList.get(indexToDel) + " deleted");
                objectList.remove(indexToDel);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Wrong index, try again");
                delete();
            }
        } else System.out.println("List size < 0");
    }

    private void find() {
        Scanner sc = new Scanner(System.in);
        String param = sc.nextLine();
        for (Employee e : objectList
                ) {
            if (e.getJob().toLowerCase().contains(param.toLowerCase()) || e.getName().toLowerCase().contains(param.toLowerCase())) {
                System.out.println(e);
            }
        }
    }

    private void getAllList() {
        for (int i = 0; i < objectList.size(); i++) {
            System.out.println("Index " + i + " : \n" + objectList.get(i));
        }
    }

    private void addToMiddle() {
        objectList.add(objectList.size() / 2, createEmployee());
    }

    private void addByIndex() {
        Scanner sc = new Scanner(System.in);
        Employee employee = createEmployee();
        System.out.println("Select index");
        try {
            objectList.add(sc.nextInt(), employee);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong index");
            addByIndex();
        }
    }


    private void add() {
        objectList.add(createEmployee());
    }

    private Employee createEmployee() {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        try {
            System.out.print("Input Name: ");
            employee.setName(sc.nextLine());
            System.out.println();

            System.out.print("Input Job: ");
            employee.setJob(sc.nextLine());
            System.out.println();

            System.out.print("Input Salary: ");
            employee.setSalary(sc.nextInt());
            System.out.println();

        } catch (Exception e) {
            System.out.println("Wrong statement. Try again");
            createEmployee();
        }
        return employee;
    }

}









/**
 *     Thx kasad0r for a help <3
 */
package level4.izvp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.*;

public class Lab1 {
    Scanner sc = new Scanner(System.in);
    Scanner scLine = new Scanner(System.in);

    public static void main(String[] args) {
        Lab1 lab = new Lab1();
        lab.task1();
        lab.task2();
        lab.task3();
        lab.task4();
        lab.task5();
    }


    public void task1() {
        System.out.println("task 1");
        System.out.println("Input g");
        double g = sc.nextDouble();
        System.out.println("1st sec "+g/2);
        System.out.println("2nd sec "+4*g/2);
    }

    public void task2(){
        System.out.println("\ntask 2");
        Point A = new Point(0,0);
        Point B = new Point(17,16);
        Point C = new Point(-17,18);
        Triangle triangle = new Triangle(A,B,C);
        System.out.println("M = "+triangle.distance(B,triangle.middleOfSide(A,C)));
        System.out.println("R = "+triangle.inscribedCircle());
    }

    public void task3() {
        System.out.println("\ntask 3");
        double x = 0, a = 0, b = 0, c = 0, d = 0;
        System.out.println("Input 4 vars, press Enter after each one");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        System.out.println("Input x");
        x = sc.nextDouble();
        double eps = c*pow(x*x+d*exp(1.3),1/5);
        double fi = tan(x+a)-log(abs(b+7));
        //1
        if(abs(x) < 10) System.out.println("ansv: "+func19(fi));
        else if(abs(x) >= 10) System.out.println("ansv: "+func20(eps));
        System.out.println();
        //2
        if(abs(x) < 10) System.out.println("ansv: "+func19(fi));
        if(abs(x) >= 10) System.out.println("ansv: "+func20(eps));
    }

    public void task4() {
        System.out.println("\ntask 4");
        System.out.println("Input type of work");
        String s = scLine.nextLine();
        char type = s.toCharArray()[0];
        //1
        double salary = 0, tax = 0, toPay = 0;
        if (type == 'A') {
            salary = 100 * abs(func19(17) + 50);
            tax = salary * 0.1;
            toPay = salary - tax;
            System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
        } else if (type == 'B') {
            salary = 150 * abs(func20(17) + 100);
            tax = salary * 0.15;
            toPay = salary - tax;
            System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
        } else if (type == 'C') {
            salary = 200 * abs(func21(17) + 135);
            tax = salary * 0.2;
            toPay = salary - tax;
            System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
        }else {
            System.err.println("Wrong input");
            task4();
        }
        //2v
        System.out.println();
        if (type == 'A') {
            salary = 100 * abs(func19(17) + 50);
            tax = salary * 0.1;
            toPay = salary - tax;
            System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
        }
        if (type == 'B') {
            salary = 150 * abs(func20(17) + 100);
            tax = salary * 0.15;
            toPay = salary - tax;
            System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
        }
        if (type == 'C') {
            salary = 200 * abs(func21(17) + 135);
            tax = salary * 0.2;
            toPay = salary - tax;
            System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
        }
        if(type != 'A' && type != 'B' && type != 'C') {
            System.err.println("Wrong input");
            task4();
        }
        //3
        System.out.println();
        switch (type) {
            case 'A':
                salary = 100 * abs(func19(17) + 50);
                tax = salary * 0.1;
                toPay = salary - tax;
                System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
                break;
            case 'B':
                salary = 150 * abs(func20(17) + 100);
                tax = salary * 0.15;
                toPay = salary - tax;
                System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
                break;
            case 'C':
                salary = 200 * abs(func21(17) + 135);
                tax = salary * 0.2;
                toPay = salary - tax;
                System.out.println("Salary: " + salary + "\nTax: " + tax + "\nTo pay: " + toPay);
                break;

                default:
                    System.err.println("Wrong input");
                    task4();
                    break;
        }
        //4
    }

    public void task5() {
        System.out.println("\ntask 4");
        List<Group> groups = new ArrayList<>(500);
        groups = addGroups(groups);
        System.out.println("Input index of group");
        int index = sc.nextInt();
        for (Group group: groups) {
            if (group.getIndex() == index) System.out.println(group.toString());
        }
    }


    public double func19(double x) {
        return 13.4*cos(abs(x))*sin(x*x - 2.25);
    }

    public double func20(double x) {
        return cos(x*x - 3.8)/4.5 - 9.7 * sin(x - 3.1);
    }

     public double func21(double x) {
        return 13.4*sin(-1.26 * x)*cos(abs(x/7.5));
     }

     public List<Group> addGroups(List<Group> groups) {
        groups.add(new Group(471,26));
         groups.add( new Group(472,29));
         groups.add( new Group(371,25));
         groups.add( new Group(372,23));
         groups.add( new Group(172,27));
         groups.add( new Group(132,29));
         groups.add( new Group(392,21));
         groups.add( new Group(192,20));
         return groups;
     }


    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

    }

    public class Triangle{
        private Point pointA;
        private Point pointB;
        private Point pointC;

        public Triangle(Point pointA, Point pointB, Point pointC) {
            this.pointA = pointA;
            this.pointB = pointB;
            this.pointC = pointC;
        }

        public Point getPointA() {
            return pointA;
        }

        public void setPointA(Point pointA) {
            this.pointA = pointA;
        }

        public Point getPointB() {
            return pointB;
        }

        public void setPointB(Point pointB) {
            this.pointB = pointB;
        }

        public Point getPointC() {
            return pointC;
        }

        public void setPointC(Point pointC) {
            this.pointC = pointC;
        }

        public Point middleOfSide(Point p1, Point p2) {
            return new Point((p1.getX()+p2.getX())/2,(p1.getY()+p2.getY())/2);
        }

        public double perimeter() {
            return (distance(pointA,pointB) + distance(pointA,pointC) + distance(pointB,pointC));
        }

        public double area() {
            double halfPerimeter = perimeter() / 2;
            return sqrt(halfPerimeter*(halfPerimeter-distance(pointA,pointB))*(halfPerimeter-distance(pointA,pointC))*
                    (halfPerimeter-distance(pointB,pointC)));
        }

        public double inscribedCircle() {
            return area()/(perimeter()/2);
        }

        public double distance(Point p1, Point p2) {
            return sqrt(pow((p2.getX()-p1.getX()),2)+pow((p2.getY()-p1.getY()),2));
        }
    }

    public class Group {
        private int index;
        private String name;
        private int countOfStudents;

        public Group(int index, int countOfStudents) {
            this.index = index;
            this.name = name;
            this.countOfStudents = countOfStudents;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCountOfStudents() {
            return countOfStudents;
        }

        public void setCountOfStudents(int countOfStudents) {
            this.countOfStudents = countOfStudents;
        }

        private String indexing() {
            String out = "";
            int level = index/100;
            int spec = (index/10)-10*level;
            int numb = index%((int)(index/10) *10);
            if(level>0 && level <= 4)
            out+=level+" курс, ";
            else {
                System.err.println("Wrong input values");
                task5();
            }
            switch (spec) {
                case 7: out+="РПЗ"; break;
                case 3: out+="Обсуговування систем і мереж"; break;
                case 9: out+="Обслуговування систем і комплексів"; break;
                default: out+="Економіка"; break;
            }
            out+=", "+numb+" група";
            return out;
        }

        @Override
        public String toString() {
            return "Group "+ index +
                    "\nName: " + indexing() +
                    "\nCount of students: " + countOfStudents;
        }
    }
}

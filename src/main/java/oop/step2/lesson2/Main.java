package oop.step2.lesson2;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<FibonacciValues> fibonacciValues = new ArrayList<>();
    static ArrayList<Fibonacci> fibonaccis = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Заповнення масиву...");
        int[][] array = new int[1000][1000];
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                array[i][j] = random();
            }
        }
        System.out.println("Масив заповнений " +
                "\nПошук чисел Фібоначчі...");
        findFibonacci(25);
        System.out.println("Числа Фібоначчі знайдено " +
                "\nПошук еквівалентних значень...");
        findEquals(array);

    }



    public static int random() {
        return (new Random().nextInt(100)) + 1;

    }

    public static void findFibonacci(int n) {
        int a = 1;
        int b = 1;
        int sumFib;
        for(int i = 0; i < n; i++){
            sumFib = a + b;
            fibonacciValues.add(new FibonacciValues(sumFib,a,b));
            System.out.println(sumFib+": "+a+" + "+b);
            a = b;
            b = sumFib;
        }
    }

    public static FibonacciValues getFibonacciValues(int val) {
        for(FibonacciValues fv: fibonacciValues) {
            if(val == fv.getValue()) {
                return fv;
            }
        } return null;
    }

    public static boolean searchForFib(int val) {
        for(FibonacciValues fv: fibonacciValues) {
            if(val == fv.getValue()) {
                return true;
            }
        } return false;
    }

    public static void findEquals(int[][] array) {
        for (int i = 2; i < array[0].length; i++) {
            for (int j = 2; j < array[0].length; j++) {
                if(searchForFib(array[i][j]) && array[i][j] == (array[i][j-1]+array[i][j-2])) {
                    Fibonacci f = new Fibonacci(i,j,getFibonacciValues(array[i][j]).getValue(),
                            getFibonacciValues(array[i][j]).getPrev1Value(),getFibonacciValues(array[i][j]).getPrev2Value());
                    fibonaccis.add(f);
                    addToData(f);
                    //System.out.println("Число "+f.getValue()+" знайдено і додато до БД");
                }
            }
        }
    }

    public static void addToData(Fibonacci f) {
        String query = "INSERT INTO oop.fibonachi (`x`,`y`,`value`, `value_1`,`value_2`) \n" +
                "values (\""+f.getX()+"\",\""+f.getY()+"\",\""+f.getValue()+"\",\""+f.getValue_1()+"\",\""+f.getValue_2()+"\");";
        try{
            Statement st = new FibonacciConnect().getConnection().createStatement();
            st.executeUpdate(query);
        }catch (SQLException ex) {
            System.err.println("SQLException is working");
        }catch (RuntimeException e) {
            System.err.println("RuntimeException is working");
        }
    }

}

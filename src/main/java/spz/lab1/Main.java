package spz.lab1;

public class Main {
    private static boolean array[] = {true,true,true,true,true};
    public static void main(String[] args) {
        System.out.println(Math.exp(-24));
        while(true) {
            Philos_1 p1 = new Philos_1();
            p1.run();
            Philos_2 p2 = new Philos_2();
            p2.run();
            Philos_3 p3 = new Philos_3();
            p3.run();
            Philos_4 p4 = new Philos_4();
            p4.run();
            Philos_5 p5 = new Philos_5();
            p5.run();
        }
    }
    static class Philos_1 implements Runnable{
        @Override
        public void run() {
            if(array[0] && array[1]){
                System.out.println("Philosof 1 is eating");
                try {
                    array[0] = false;
                    array[1] = false;
                    Thread.sleep(3000);
                    array[1] = true;
                    array[0] = true;
                    Thread.sleep(((int)(Math.random()*10)*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                run();
            }
        }
    }
    static class Philos_2 implements Runnable{
        @Override
        public void run() {
            if(array[1] && array[2]){
                System.out.println("Philosof 2 is eating");
                try {
                    array[1] = false;
                    array[2] = false;
                    Thread.sleep(3000);
                    array[1] = true;
                    array[2] = true;
                    Thread.sleep(((int)(Math.random()*10)*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                run();
            }
        }
    }
    static class Philos_3 implements Runnable{
        @Override
        public void run() {
            if(array[2] && array[3]){
                System.out.println("Philosof 3 is eating");
                try {
                    array[2] = false;
                    array[3] = false;
                    Thread.sleep(3000);
                    array[2] = true;
                    array[3] = true;
                    Thread.sleep(((int)(Math.random()*10)*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                run();
            }
        }
    }
    static class Philos_4 implements Runnable{
        @Override
        public void run() {
            if(array[3] && array[4]){
                System.out.println("Philosof 4 is eating");
                try {
                    array[3] = false;
                    array[4] = false;
                    Thread.sleep(3000);
                    array[3] = true;
                    array[4] = true;
                    Thread.sleep(((int)(Math.random()*10)*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                run();
            }
        }
    }
    static class Philos_5 implements Runnable{
        @Override
        public void run() {
            if(array[4] && array[0]){
                System.out.println("Philosof 5 is eating");
                try {
                    array[4] = false;
                    array[0] = false;
                    Thread.sleep(3000);
                    array[4] = true;
                    array[0] = true;
                    Thread.sleep(((int)(Math.random()*10)*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                run();
            }
        }
    }
}

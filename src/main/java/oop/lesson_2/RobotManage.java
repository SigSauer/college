package oop.lesson_2;

/**
 * Created by PDV00 on 27.10.2017.
 */

public class RobotManage {
    public static void main(String[] args) {

        Robot robot1 = new Robot(0,0);
        Robot robot2 = new Robot(0,0);
        robot1.setX(234);
        robot1.setY(563);
        System.out.println("Robot 1: ");
        System.out.println("X: "+robot1.getX()+"\nY: "+robot1.getY());

        System.out.println();

        robot2.setX(444);
        robot2.setY(666);
        System.out.println("Robot 2: ");
        System.out.println("X: "+robot2.getX()+"\nY: "+robot2.getY());
    }
}

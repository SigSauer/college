package oop.step2.exam.task4;

public class MainRobot {

    public static void main(String[] args) {
        Robot robot1 = new Robot(1,0,0,100);
        robot1.setCourse(200);
        robot1.move();
        robot1.move();
        robot1.setCourse(100);
        robot1.move();
        robot1.getWay();
    }
}

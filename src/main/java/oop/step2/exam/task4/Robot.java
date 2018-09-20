package oop.step2.exam.task4;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private List<RobotAdd> way;
    private int number;
    private double x_pos;
    private double y_pos;
    private double course;
    private int distance;

    public Robot(int number, double x_pos, double y_pos, int distance) {
        this.number = number;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.distance = distance;
        way = new ArrayList<>();
        way.add(new RobotAdd(x_pos,y_pos));
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public void move() {
        x_pos += distance * Math.cos(course / 180 * Math.PI);
        y_pos += distance * Math.sin(course / 180 * Math.PI);
        way.add(new RobotAdd(x_pos,y_pos));
    }

    public void getWay() {
        for (RobotAdd aWay : way) {
            System.out.println(aWay);
        }
    }
}

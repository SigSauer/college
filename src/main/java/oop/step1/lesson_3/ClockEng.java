package oop.step1.lesson_3;

public class ClockEng {
    private int hours;
    private int minutes;

    public ClockEng(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "["+hours + ": "+ minutes+"]";
    }

    public void nextMinutes() {
        minutes++;

        checkMinutes();
    }

    public void checkMinutes() {
        if (minutes == 60) {
            nextHours();
            minutes = 0;
        }
    }

    public void nextHours() {
        hours++;
        checkHours();
    }

    public void checkHours() {
        if(hours == 24) {
            hours = 0;
            minutes = 0;

        }
    }

}



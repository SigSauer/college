package oop.step2.exam.task5;

public class Main {
    public static void main(String[] args) {
        Accessories<String> laptop = new Notebook();
        System.out.println(laptop.videocard(Produce.INTEL));
        System.out.println(laptop.processor(Produce.SONY));
        System.out.println(laptop.matherboard(Produce.SAMSUNG));
        System.out.println(laptop.memory(Produce.TOSHIBA));
    }
}

package practice.lab4;

public class Main {
    public static void main(String[] args) {
        Artists art1 = new Artists("Іван","Драма",1960);
        Artists art2 = new Artists(art1);
        art1.setGenre("Комедія");
        art1.showName();
        System.out.println();
        art2.showAll();
        System.out.println();
        Performance perf1 = new Performance(art1,"Жінка та чиновник");
        perf1.showPer();
    }
}

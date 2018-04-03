package practice.lab4;

public class Performance extends Artists{
    private String performance;

    public Performance(String name, String genre, int age, String performance) {
        super(name, genre, age);
        this.performance = performance;
    }

    public Performance(Artists artist, String performance) {
        super(artist);
        this.performance = performance;
    }

    public void setPerformce(String performance) {
        this.performance = performance;
    }

    public void showPer() {
        showAll();
        System.out.println("Назва спектаклю: "+performance);
    }
}

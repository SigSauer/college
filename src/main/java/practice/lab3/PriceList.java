package practice.lab3;

public class PriceList {
    /**
        entity-class for lab3.task2
     */
    private String name;
    private String type;
    private double price;
    private int count;

    public PriceList(String name, String type, double price, int count) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.count = count;
    }

    public void set(String n, String t, double p, int c) {
        setName(n);
        setType(t);
        setPrice(p);
        setCount(c);
    }

    public void get() {
        show();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void show() {
        System.out.println("\nНазвание: " + name +
                            "\nТип: " + type +
                            "\nЦена: " + price +
                            "\nКоличество: " + count);
    }
}

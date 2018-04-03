package practice.lab5;

public class Product {
    private String country;
    private double price;
    private int count;

    public Product(double price, String country, int count) {
        this.country = country;
        this.price = price;
        this.count = count;
    }



    public void changePrice(double price) {
        this.price = price;
        System.out.println("Змінилась ціна: "+ price +"\n");
    }
    public void changeCount(int count) {
        this.count = count;
        System.out.println("Змінилась кількість: "+ count +"\n");
    }
    public void showGeneraly() {
        System.out.println( "Країна виробник: " + country +
                            "\nЦіна за од.: "+ price +
                            "\nКількість: "+ count +"\n");
    }
}

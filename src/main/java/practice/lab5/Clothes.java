package practice.lab5;

public class Clothes extends Product {
    private String type;
    private int size;
    private boolean sex;
    private String colour;

    public Clothes(String type, int size, boolean sex, String colour, double price, String country, int count) {
        super( price, country, count);
        this.type = type;
        this.size = size;
        this.sex = sex;
        this.colour = colour;
    }

    public void showClothes() {
        System.out.println( "Тип одягу: " + type +
                            "\nРозмір: "+ size +
                            "\nСтать: "+ sex +
                            "\nКолір: "+ colour );
        showGeneraly();
    }
    public void changeSize(int size) {
        this.size = size;
        System.out.println("У одягу "+ type +" змінився розмір: "+ size +"\n");
    }
    public void changeSex(boolean sex) {
        this.sex = sex;
        System.out.println("У одягу "+ type +" змінилась стать: "+ sex +"\n");
    }
    public void changeType(String type) {
        this.type = type;
        System.out.println("Змінився тип: "+ type +"\n");
    }
    public void changeColour(String colour) {
        this.colour = colour;
        System.out.println("У одягу "+ type +" змінився колір: "+ colour +"\n");
    }





}

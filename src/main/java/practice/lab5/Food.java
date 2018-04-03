package practice.lab5;

public class Food extends Product{
    private String name;
    private String subName;
    private int productTime;

    public Food(String name, String subName, int productTime, double price, String country, int count) {
        super(price, country, count);
        this.name = name;
        this.subName = subName;
        this.productTime = productTime;
    }

    public void changeSN(String subName) {
        this.subName = subName;
        System.out.println("У продукті "+name+" змінився підназва: "+ subName +"\n");
    }

    public void changePT(int productTime) {
        this.productTime = productTime;
        System.out.println("У продукті "+name+" змінилось кількість днів від виробництва: "+ productTime +"\n");
    }

    public void showFood() {
        System.out.println( "Назва: " + name +
                            "\nПідназва: "+ subName +
                            "\nКількість днів від виробництва: "+productTime);
        showGeneraly();
    }



}

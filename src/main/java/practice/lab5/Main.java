package practice.lab5;

public class Main {
    public static void main(String[] args) {
        Clothes pants = new Clothes("Штани",56,true,"Синій",200,"Тайвань",5);
        Clothes shirt = new Clothes("Футболка",44,false,"Білий",400,"Франція",2);
        Food milk = new Food("Молоко","Знежирене",1,10,"Україна",20);
        Food bread = new Food("Хліб","Український",2,15,"Білорусь",12);
        shirt.changeColour("Зелений");
        pants.showClothes();
        bread.changePT(3);
        milk.showFood();
    }
}

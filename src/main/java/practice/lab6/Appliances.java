package practice.lab6;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class Appliances {
    private int number;
    private String type;
    private String model;
    private String name;
    private String company;
    private int quantity;
    private double price;
    private String dateOfProduction;
    private int warrantyPeriod;

    public Appliances(@NotNull int number, String type, String model, String name, String company,
                      int quantity, double price, String dateOfProduction, int warrantyPeriod) {
        this.number = number;
        this.type = type;
        this.model = model;
        this.name = name;
        this.company = company;
        this.quantity = quantity;
        this.price = price;
        this.dateOfProduction = dateOfProduction;
        this.warrantyPeriod = warrantyPeriod;
    }

    public Appliances() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public void show() {
        System.out.println("Номер: " + number +
                "\nТип: " + type +
                "\nМодель: " + model +
                "\nНазва: " + name +
                "\nВиробник: " + company +
                "\nКількість: " + quantity +
                "\nЦіна: " + price +
                "\nДата виробництва: " + dateOfProduction +
                "\nГарантійний період: " + warrantyPeriod +"\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliances that = (Appliances) o;
        return number == that.number &&
                quantity == that.quantity &&
                Double.compare(that.price, price) == 0 &&
                warrantyPeriod == that.warrantyPeriod &&
                Objects.equals(type, that.type) &&
                Objects.equals(model, that.model) &&
                Objects.equals(name, that.name) &&
                Objects.equals(company, that.company) &&
                Objects.equals(dateOfProduction, that.dateOfProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, model, name, company, quantity, price, dateOfProduction, warrantyPeriod);
    }

}

package oop.step2.lesson1;

public class Workers {
    private int id;
    private String name;
    private String surname;

    public Workers() {
    }

    public Workers(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Workers(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Worker: " +
                "\nid: " + id +
                "\nname: " + name +
                "\nsurname: " + surname;
    }
}
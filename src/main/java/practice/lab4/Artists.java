package practice.lab4;

import com.sun.istack.internal.NotNull;

public class Artists {
    private String name;
    private String genre;
    private int age;


    public Artists(String name, String genre, int age) {
        this.name = name;
        this.genre = genre;
        this.age = age;
    }

    public Artists(@NotNull Artists artist) {
        this.name = artist.name;
        this.genre = artist.genre;
        this.age = artist.age;
    }

    public void showAll() {
        System.out.println( "Їм'я: " + name +
                            "\nЖанр: "+ genre +
                            "\nРік народження: "+ age);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void showName() {
        System.out.println( "Їм'я: " + name);
    }
}


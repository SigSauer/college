package study.Parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Offline {
    public static void main(String[] args) throws IOException {
        List<Shop> shopList = new ArrayList<>();


        for (int i = 1; i < 20; i++) {


        Document doc = Jsoup.connect("http://shop.guru.ua/kiev/catalog/page/"+i+"/").get();
            System.out.println(doc.body().child(10).child(1).child(0).text());
            Elements h2 = doc.getElementsByAttributeValue("class", "list-post-title");
        h2.forEach(h2lan -> {
            Element aElement = h2lan.child(0);
            String u = "http:"+aElement.attr("href");
            String n = aElement.child(0).text();
            shopList.add(new Shop(u,n));
        });
    }
        //shopList.forEach(System.out::println);
    }
}

class Shop {
    private String name;
    private String address;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n" +
                "Name: " + name + '\n' +
                "Address: " + address;
    }
}

package study.Parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Article> articles = new ArrayList<>();

        Document doc = Jsoup.connect("http://4pda.ru").get();
        Elements h2 = doc.getElementsByAttributeValue("class", "list-post-title");
        h2.forEach(h2lan -> {
            Element aElement = h2lan.child(0);
            String u = "http:"+aElement.attr("href");
            String n = aElement.child(0).text();
            articles.add(new Article(u,n));
        });
        articles.forEach(System.out::println);
    }
}

class Article {
    private String url;
    private String name;

    public Article(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n" +
                "Url: " + url + "\n" +
                "Name: " + name + "\n";
    }
}

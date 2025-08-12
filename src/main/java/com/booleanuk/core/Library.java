package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Paper> collection = new ArrayList<>();


    public void addToStock(Paper item) {
        this.collection.add(item);
    }



    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInPaper(String title) {
        List<Paper> filtered = this.collection.stream()
                .filter(article -> article.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutPaper(String title) {
        List<Paper> filtered = this.collection.stream()
                .filter(article -> article.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

}

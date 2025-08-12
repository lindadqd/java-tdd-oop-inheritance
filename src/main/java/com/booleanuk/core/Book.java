package com.booleanuk.core;

public class Book extends Paper {
    private Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

}

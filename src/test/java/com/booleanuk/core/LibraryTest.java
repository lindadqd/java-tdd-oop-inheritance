package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class LibraryTest {

    @Test
    public void addToStock(){
        Library library = new Library();
        Author author = new Author("Bob","bob@bob.com","bob.com");
        Article article = new Article("article", author);
        library.addToStock(article);

        Book book = new Book("book", author);
        library.addToStock(book);

        Newspaper newspaper = new Newspaper("newspaper");
        library.addToStock(newspaper);

        Assertions.assertTrue(library.collection.contains(article));
        Assertions.assertTrue(library.collection.contains(book));
        Assertions.assertTrue(library.collection.contains(newspaper));
    }

    @Test
    public void checkOutPaper(){
        Library library = new Library();
        Author author = new Author("Bob","bob@bob.com","bob.com");
        Article article = new Article("article", author);
        library.addToStock(article);

        Assertions.assertEquals("item has been checked out", library.checkOutPaper("article"));
        Assertions.assertEquals("item is currently on loan", library.checkOutPaper("article"));

    }

    @Test
    public void checkInPaper(){
        Library library = new Library();
        Author author = new Author("Bob","bob@bob.com","bob.com");

        Article article = new Article("article", author);
        library.addToStock(article);

        Assertions.assertEquals("item is not currently on loan", library.checkInPaper("article"));
        library.checkOutPaper("article");
        Assertions.assertEquals("item has been checked in", library.checkInPaper("article"));
    }


}

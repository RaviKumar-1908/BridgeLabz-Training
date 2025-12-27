package com.constructor.levelone;

public class Book1 {

    public String ISBN;
    protected String title;
    private String author;

    public Book1(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for private member
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for private member
    public String getAuthor() {
        return author;
    }
}

package com.springbootpractice.bootpractice;

public class Book {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    long id;
    String name;
    String author;


    public Book(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

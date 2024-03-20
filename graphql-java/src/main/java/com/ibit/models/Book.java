package com.ibit.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String id;
    private String title;
    private String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getters and setters
}

package com.example.module.books.dto;

public class BookDto {
    private String author;
    private String title;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BookDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookDto setTitle(String title) {
        this.title = title;
        return this;
    }
}

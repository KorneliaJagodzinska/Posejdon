package com.example.module.books.dto;

public class BookDetailsDto {
    private String isbn;
    private String lang;

    public String getIsbn() {
        return isbn;
    }

    public String getLang() {
        return lang;
    }

    public BookDetailsDto setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookDetailsDto setLang(String lang) {
        this.lang = lang;
        return this;
    }
}

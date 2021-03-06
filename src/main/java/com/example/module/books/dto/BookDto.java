package com.example.module.books.dto;

import java.util.Set;

public class BookDto {
    private String author;
    private String title;
    private BookDetailsDto details;
    private Set<String> tags;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BookDetailsDto getDetails() {
        return details;
    }

    public BookDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookDto setDetails(BookDetailsDto details) {
        this.details = details;
        return this;
    }

    public Set<String> getTags() {
        return tags;
    }

    public BookDto setTags(Set<String> tags) {
        this.tags = tags;
        return this;
    }
}

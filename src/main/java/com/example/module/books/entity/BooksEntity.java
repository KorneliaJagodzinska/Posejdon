package com.example.module.books.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "books")
public class BooksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Author for book is required")
    private String author;
    @NotNull(message = "Title for book is required")
    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id", referencedColumnName = "id")
    private BooksDetailsEntity details;

    @OneToMany(mappedBy = "book")
    private Set<BooksTagsEntity> tags;

    public Set<BooksTagsEntity> getTags() {
        return tags;
    }

    public BooksEntity setTags(Set<BooksTagsEntity> tags) {
        this.tags = tags;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BooksEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public BooksEntity setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BooksEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public BooksEntity setDetails(BooksDetailsEntity details) {
        this.details = details;
        return this;
    }

    public BooksDetailsEntity getDetails() {
        return details;
    }
}

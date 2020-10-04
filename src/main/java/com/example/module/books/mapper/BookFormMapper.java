package com.example.module.books.mapper;

import com.example.module.books.dto.BookForm;
import com.example.module.books.entity.BooksDetailsEntity;
import com.example.module.books.entity.BooksEntity;
import com.example.module.books.entity.BooksTagsEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BookFormMapper {
    public static BooksEntity map(BookForm form) {
        BooksEntity entity = new BooksEntity();
        entity.setTitle(form.getTitle())
                .setAuthor(form.getAuthor())
                .setDetails(getDetails(form))
                .setTags(getTags(form, entity));
        return entity;
    }

    private static BooksDetailsEntity getDetails(BookForm form) {
        return new BooksDetailsEntity()
                .setIsbn(form.getIsbn())
                .setLang(form.getLang());
    }

    private static Set<BooksTagsEntity> getTags(BookForm form, BooksEntity entity) {
        return form
                .getTags()
                .stream()
                .map(tag -> new BooksTagsEntity()
                        .setValue(tag)
                        .setBook(entity))
                .collect(Collectors.toSet());
    }
}

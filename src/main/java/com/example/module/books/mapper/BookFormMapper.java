package com.example.module.books.mapper;

import com.example.module.books.dto.BookForm;
import com.example.module.books.entity.BooksEntity;

public class BookFormMapper {
    public static BooksEntity map(BookForm form) {
        return new BooksEntity()
                .setTitle(form.getTitle())
                .setAuthor(form.getAuthor());
    }
}

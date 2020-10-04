package com.example.module.books.service;

import com.example.module.books.entity.BooksEntity;
import com.example.module.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    private BooksRepository booksRepository;

    public BooksEntity getOne(Long id) {
        return booksRepository.getOne(id);
    }

    public List<BooksEntity> getAll() {
        return booksRepository.findAll();
    }

    public BooksEntity create(BooksEntity entity) {
        return booksRepository.saveAndFlush(entity);
    }

    public void delete(Long id) {
        booksRepository.deleteById(id);
    }

    public BooksEntity update(Long id, BooksEntity entity) {
        return booksRepository.saveAndFlush(entity.setId(id));
    }
}

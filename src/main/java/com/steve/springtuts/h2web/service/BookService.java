package com.steve.springtuts.h2web.service;

import com.steve.springtuts.h2web.model.Book;
import com.steve.springtuts.h2web.repositiry.IBookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final IBookRepository repository;

    public BookService(IBookRepository repository) {
        this.repository = repository;
    }

    public Iterable<Book> allBooks() {
        return repository.findAll();
    }
}

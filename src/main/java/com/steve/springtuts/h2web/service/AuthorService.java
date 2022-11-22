package com.steve.springtuts.h2web.service;

import com.steve.springtuts.h2web.model.Author;
import com.steve.springtuts.h2web.repositiry.IAuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final IAuthorRepository repository;

    public AuthorService(IAuthorRepository repository) {
        this.repository = repository;
    }

    public Iterable<Author> getAuthors(){
        return repository.findAll();
    }


}

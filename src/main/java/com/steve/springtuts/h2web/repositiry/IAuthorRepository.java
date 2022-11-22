package com.steve.springtuts.h2web.repositiry;

import com.steve.springtuts.h2web.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorRepository extends CrudRepository<Author, Long> { }

package com.steve.springtuts.h2web.repositiry;

import com.steve.springtuts.h2web.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface IBookRepository extends CrudRepository<Book, Long> {
}

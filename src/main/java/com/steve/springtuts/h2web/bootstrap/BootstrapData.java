package com.steve.springtuts.h2web.bootstrap;

import com.steve.springtuts.h2web.model.Author;
import com.steve.springtuts.h2web.model.Book;
import com.steve.springtuts.h2web.model.Publisher;
import com.steve.springtuts.h2web.repositiry.IAuthorRepository;
import com.steve.springtuts.h2web.repositiry.IBookRepository;
import com.steve.springtuts.h2web.repositiry.IPublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final IAuthorRepository authorRepository;
    private final IBookRepository bookRepository;

    private final IPublisherRepository publisherRepository;

    public BootstrapData(IAuthorRepository authorRepository, IBookRepository bookRepository, IPublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","12312222560633");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Book noEJB= new Book("J2EE Development without EJB","1493894839843");
        rod.getBooks().add(ddd);
        noEJB.getAuthors().add(eric);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());

        Publisher penguin = new Publisher(
                "Penguin Publishers",
                "123 Book Road",
                "Faro",
                "NY",
                "122345"
        );

        publisherRepository.save(penguin);

        System.out.println("Publisher is: " + penguin);


    }
}

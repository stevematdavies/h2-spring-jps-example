package com.steve.springtuts.h2web.controller;

import com.steve.springtuts.h2web.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getBooks(Model model){
        model.addAttribute("books", bookService.allBooks());
        return "books";
    }

}

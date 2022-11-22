package com.steve.springtuts.h2web.controller;

import com.steve.springtuts.h2web.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/authors")
public class AuthorController {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping
    public String getAuthors(Model model){
        model.addAttribute("authors", service.getAuthors());
        return "authors";
    }
}

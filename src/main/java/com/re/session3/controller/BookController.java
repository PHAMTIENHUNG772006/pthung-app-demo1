package com.re.session3.controller;

import com.re.session3.model.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping(value = "/students", produces = {"application/json", "application/xml"})
    public List<Book> getProducts() {
        return Arrays.asList();

    }
}


package com.example.bookstore.controller;

import com.example.bookstore.exception.ResourceNotFoundException;
import com.example.bookstore.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        // Example: throw ResourceNotFoundException if book not found
        throw new ResourceNotFoundException("Book not found with id " + id);
    }
}

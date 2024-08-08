package com.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Example method
    public void someServiceMethod() {
        // Method implementation
    }
}

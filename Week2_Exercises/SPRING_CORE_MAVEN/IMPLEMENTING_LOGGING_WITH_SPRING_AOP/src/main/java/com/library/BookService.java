package com.yourcompany.library;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Getter method for verification
    public BookRepository getBookRepository() {
        return bookRepository;
    }

    // Other methods and business logic
}

package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {

    private Map<Long, Book> bookRepository = new HashMap<>();
    private long idCounter = 1;

    public Book getBook(Long id) {
        return bookRepository.get(id);
    }

    public Book addBook(Book book) {
        book.setId(idCounter++);
        bookRepository.put(book.getId(), book);
        return book;
    }

    public Book updateBook(Long id, Book book) {
        if (bookRepository.containsKey(id)) {
            book.setId(id);
            bookRepository.put(id, book);
            return book;
        } else {
            return null;
        }
    }

    public boolean deleteBook(Long id) {
        return bookRepository.remove(id) != null;
    }
}

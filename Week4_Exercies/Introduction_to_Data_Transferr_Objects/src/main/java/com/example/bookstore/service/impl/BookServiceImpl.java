package com.example.bookstore.service.impl;

import com.example.bookstore.dto.BookDTO;
import com.example.bookstore.entity.Book;
import com.example.bookstore.mapper.BookMapper;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll().stream()
            .map(BookMapper.INSTANCE::bookToBookDTO)
            .collect(Collectors.toList());
    }

    @Override
    public BookDTO getBookById(Long id) {
        return bookRepository.findById(id)
            .map(BookMapper.INSTANCE::bookToBookDTO)
            .orElse(null);
    }

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = BookMapper.INSTANCE.bookDTOToBook(bookDTO);
        return BookMapper.INSTANCE.bookToBookDTO(bookRepository.save(book));
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        if (!bookRepository.existsById(id)) {
            return null;
        }
        Book book = BookMapper.INSTANCE.bookDTOToBook(bookDTO);
        book.setId(id);
        return BookMapper.INSTANCE.bookToBookDTO(bookRepository.save(book));
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

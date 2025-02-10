package com.library_management_system.service;

import com.library_management_system.dto.BookDTO;
import com.library_management_system.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private final BookDTO bookDTO;

    public BookService(BookDTO bookDTO) {
        this.bookDTO = bookDTO;
    }

    public List<Book> getAllBooks() {
        return bookDTO.findAll();
    }

    public Book addBook(Book book) {
        return bookDTO.save(book);
    }

    public Book getBookById(Long id) {
        return bookDTO.findById(id).orElse(null);
    }

    public void updateBookCopies(Long id, int copies) {
        Book book = bookDTO.findById(id).orElse(null);
        if (book != null) {
            book.setCopies(copies);
            bookDTO.save(book);
        }
    }
}
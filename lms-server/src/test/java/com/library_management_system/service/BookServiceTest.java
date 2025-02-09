package com.library_management_system.service;

import com.library_management_system.DTO.BookDTO;
import com.library_management_system.model.Book;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BookServiceTest {

    @Mock
    private BookDTO bookDTO;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testAddBook() {
        Book book = new Book("Title 1", "Author 1", 1);
        when(bookDTO.save(book)).thenReturn(book);

        Book savedBook = bookService.addBook(book);
        assertEquals("Test Book", savedBook.getTitle());
    }

    @Test
    public void testGetBookById() {
        Book book = new Book("Title 2", "Author 2", 2);
        when(bookDTO.findById(1L)).thenReturn(Optional.of(book));

        Book foundBook = bookService.getBookById(1L);
        assertEquals(1L, foundBook.getId());
    }
}
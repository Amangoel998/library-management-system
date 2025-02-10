package com.library_management_system.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.library_management_system.dto.BorrowDTO;
import com.library_management_system.dto.UserDTO;
import com.library_management_system.model.Book;
import com.library_management_system.model.User;

@ExtendWith(MockitoExtension.class)
public class BorrowServiceTest {
    @Mock
    private BookService bookService;

    @Mock
    private UserDTO userDTO;

    @Mock
    private BorrowDTO borrowDTO;

    @InjectMocks
    private BorrowService borrowService;

    @Test
    public void testBorrowBook() {
        Book book = new Book("Title 1", "AUthor 1", 0);
        book.setId(1L);
        book.setCopies(1);

        User user = new User();
        user.setUsername("testuser");

        when(bookService.getBookById(1L)).thenReturn(book);
        when(userDTO.findByUsername("testuser")).thenReturn(user);

        String result = borrowService.borrowBook(1L, "testuser");
        assertEquals("Book borrowed successfully", result);
    }
}
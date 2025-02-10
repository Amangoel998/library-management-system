package com.library_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library_management_system.dto.BorrowDTO;
import com.library_management_system.dto.UserDTO;
import com.library_management_system.model.Book;
import com.library_management_system.model.Borrow;
import com.library_management_system.model.User;

import java.time.LocalDate;

@Service
public class BorrowService {
    @Autowired
    private BookService bookService;

    @Autowired
    private UserDTO userDTO;

    @Autowired
    private BorrowDTO borrowDTO;

    public String borrowBook(Long bookId, String username) {
        Book book = bookService.getBookById(bookId);
        User user = userDTO.findByUsername(username);

        if (book == null || user == null) {
            return "Book or User not found";
        }

        if (book.getCopies() <= 0) {
            return "No copies available";
        }

        Borrow record = new Borrow();
        record.setBook(book);
        record.setUser(user);
        record.setBorrowDate(LocalDate.now());
        borrowDTO.save(record);

        bookService.updateBookCopies(bookId, book.getCopies() - 1);
        return "Book borrowed successfully";
    }

    public String returnBook(Long bookId, String username) {
        Borrow record = borrowDTO.findByBookIdAndUserUsername(bookId, username);
        if (record == null) {
            return "No borrow record found";
        }

        record.setReturnDate(LocalDate.now());
        borrowDTO.save(record);

        Book book = bookService.getBookById(bookId);
        bookService.updateBookCopies(bookId, book.getCopies() + 1);
        return "Book returned successfully";
    }
}

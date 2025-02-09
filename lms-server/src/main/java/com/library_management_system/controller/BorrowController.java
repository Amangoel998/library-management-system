package com.library_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library_management_system.service.BorrowService;

@RestController
@RequestMapping("/borrow")
public class BorrowController {
    @Autowired
    private BorrowService borrowService;

    @PostMapping("/borrow-book")
    public String borrowBook(@RequestParam Long bookId, @RequestParam String username) {
        return borrowService.borrowBook(bookId, username);
    }

    @PostMapping("/return-book")
    public String returnBook(@RequestParam Long bookId, @RequestParam String username) {
        return borrowService.returnBook(bookId, username);
    }
}

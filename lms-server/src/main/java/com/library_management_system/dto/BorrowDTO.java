package com.library_management_system.dto;

import com.library_management_system.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowDTO extends JpaRepository<Borrow, Long> {
    Borrow findByBookIdAndUserUsername(Long bookId, String username);
}
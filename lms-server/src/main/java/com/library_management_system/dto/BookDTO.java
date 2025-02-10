package com.library_management_system.dto;

import com.library_management_system.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDTO extends JpaRepository<Book, Long> {
}
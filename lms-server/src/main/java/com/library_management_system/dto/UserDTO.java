package com.library_management_system.dto;

import com.library_management_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDTO extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
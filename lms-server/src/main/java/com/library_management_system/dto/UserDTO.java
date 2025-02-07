package com.library_management_system.dto;

import com.library_management_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDTO extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
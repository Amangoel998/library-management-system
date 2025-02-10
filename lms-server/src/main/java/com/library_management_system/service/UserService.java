package com.library_management_system.service;

import com.library_management_system.dto.UserDTO;
import com.library_management_system.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserDTO userDTO;

    @Autowired
    private final PasswordEncoder passwordEncoder;

    public UserService(UserDTO userDTO, PasswordEncoder passwordEncoder) {
        this.userDTO = userDTO;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userDTO.save(user);
    }

}
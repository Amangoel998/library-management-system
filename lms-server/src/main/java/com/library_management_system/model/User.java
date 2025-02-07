package com.library_management_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        password = this.password;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        username = this.username;
    }

}
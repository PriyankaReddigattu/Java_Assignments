package com.example.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

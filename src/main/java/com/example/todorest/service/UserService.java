package com.example.todorest.service;

import com.example.todorest.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findById(int id);

    User save(User user);

    Optional<User> findByEmail(String email);

    boolean delete(int id, int id1);
}

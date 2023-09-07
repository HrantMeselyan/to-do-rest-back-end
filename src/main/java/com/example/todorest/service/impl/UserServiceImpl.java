package com.example.todorest.service.impl;

import com.example.todorest.entity.Role;
import com.example.todorest.entity.User;
import com.example.todorest.repository.UserRepository;
import com.example.todorest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean delete(int id, int id1) {
        boolean deleted = false;
        if (id == id1) {
            userRepository.deleteById(id);
            deleted = true;
        }
        return deleted;
    }
}

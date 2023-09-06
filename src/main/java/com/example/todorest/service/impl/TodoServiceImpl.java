package com.example.service.impl;

import com.example.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl {
    private final TodoRepository todoRepository;

}

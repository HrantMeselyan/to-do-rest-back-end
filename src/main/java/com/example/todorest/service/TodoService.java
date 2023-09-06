package com.example.service;

import com.example.dto.TodoDto;
import com.example.entity.Todo;

import java.util.List;

public interface TodoService {
    TodoDto create(TodoDto todoDto);

    List<TodoDto> getAll(int id);

    List<Todo> findAllByCategoryId(int categoryId);

    boolean delete(int id, int userId);

    List<Todo> findAllByStatus(int id, String status);
}



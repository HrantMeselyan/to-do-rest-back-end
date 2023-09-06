package com.example.todorest.service;

import com.example.todorest.dto.ToDoRequestDto;
import com.example.todorest.dto.TodoDto;
import com.example.todorest.entity.Status;
import com.example.todorest.entity.Todo;

import java.util.List;

public interface TodoService {
    TodoDto create(ToDoRequestDto toDoRequestDto);

    List<TodoDto> getAll();

    List<Todo> findAllByCategoryId(int categoryId);

    void delete(int id);

    List<Todo> findAllByStatus(Status status);
}



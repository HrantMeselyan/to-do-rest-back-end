package com.example.todorest.service.impl;

import com.example.todorest.dto.ToDoRequestDto;
import com.example.todorest.dto.TodoDto;
import com.example.todorest.entity.Category;
import com.example.todorest.entity.Status;
import com.example.todorest.entity.Todo;
import com.example.todorest.mapper.TodoMapper;
import com.example.todorest.repository.CategoryRepository;
import com.example.todorest.repository.TodoRepository;
import com.example.todorest.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;
    private final TodoMapper todoMapper;
    private final CategoryRepository categoryRepository;


    @Override
    public TodoDto create(ToDoRequestDto toDoRequestDto) {
        Optional<Category> categoryOptional = categoryRepository.findById(toDoRequestDto.getCategoryId());
        Todo todo = todoMapper.getToDoRequestDto(toDoRequestDto);
        todo.setCategory(categoryOptional.orElse(null));
        return todoMapper.mapToDto(todoRepository.save(todo));
    }

    @Override
    public List<TodoDto> getAll() {
        return todoMapper.mapList(todoRepository.findAll());
    }

    @Override
    public List<Todo> findAllByCategoryId(int categoryId) {
        return todoRepository.findAllByCategory_Id(categoryId);
    }

    @Override
    @Transactional
    public void delete(int id) {
        todoRepository.deleteById(id);
    }

    @Override
    public List<Todo> findAllByStatus(Status status) {
        return todoRepository.findAllByStatus(status);
    }
}

package com.example.todorest.mapper;


import com.example.todorest.dto.ToDoRequestDto;
import com.example.todorest.dto.TodoDto;
import com.example.todorest.entity.Todo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    Todo map(TodoDto todoDto);

    TodoDto mapToDto(Todo todo);

    Todo getToDoRequestDto(ToDoRequestDto toDoRequestDto);

    List<TodoDto> mapList(List<Todo> all);
}

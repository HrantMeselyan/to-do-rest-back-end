package com.example.mapper;


import com.example.dto.TodoDto;
import com.example.entity.Todo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    Todo map(TodoDto todoDto);
    TodoDto mapToDto(Todo todo);


    List<TodoDto> mapList(List<Todo> all);
}

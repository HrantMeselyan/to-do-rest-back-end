package com.example.todorest.mapper;

import com.example.todorest.dto.CategoryDto;
import com.example.todorest.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category map(CategoryDto categoryRequestDto);

    CategoryDto map(Category category);

    List<CategoryDto> mapToList(List<Category> categoryList);
}

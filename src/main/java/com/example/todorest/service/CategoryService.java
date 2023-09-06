package com.example.todorest.service;

import com.example.todorest.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);

    List<CategoryDto> getAll();

    void delete(int id);
}

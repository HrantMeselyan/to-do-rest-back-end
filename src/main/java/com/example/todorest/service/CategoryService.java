package com.example.service;

import com.example.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);

    List<CategoryDto> getAll();

    void delete(int id);
}

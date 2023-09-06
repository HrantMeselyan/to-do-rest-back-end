package com.example.todorest.service.impl;

import com.example.todorest.dto.CategoryDto;
import com.example.todorest.mapper.CategoryMapper;
import com.example.todorest.repository.CategoryRepository;
import com.example.todorest.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return categoryMapper.map(categoryRepository.save(categoryMapper.map(categoryDto)));
    }

    @Override
    public List<CategoryDto> getAll() {
        return categoryMapper.mapToList(categoryRepository.findAll());
    }

    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}

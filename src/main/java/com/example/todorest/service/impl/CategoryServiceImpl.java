package com.example.service.impl;

import com.example.dto.CategoryDto;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public List<CategoryDto> getAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}

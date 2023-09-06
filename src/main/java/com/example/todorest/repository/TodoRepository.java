package com.example.repository;

import com.example.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Category, Integer> {
}

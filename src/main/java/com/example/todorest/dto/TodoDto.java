package com.example.dto;

import com.example.entity.Category;
import com.example.entity.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {
    private int id;
    private String title;
    private Status status;
    private Category category;
}

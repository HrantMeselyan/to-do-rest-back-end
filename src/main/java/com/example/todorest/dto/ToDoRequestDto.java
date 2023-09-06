package com.example.todorest.dto;

import com.example.todorest.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoRequestDto {
    private int id;
    private String title;
    private Status status;
    private int categoryId;

}

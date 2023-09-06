package com.example.todorest.endpoint;

import com.example.todorest.dto.StatusRequest;
import com.example.todorest.dto.ToDoRequestDto;
import com.example.todorest.dto.TodoDto;
import com.example.todorest.entity.Todo;
import com.example.todorest.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/save")
    public ResponseEntity<TodoDto> save(@RequestBody ToDoRequestDto todoDto) {
        return ResponseEntity.ok(todoService.create(todoDto));
    }

    @GetMapping
    public ResponseEntity<List<TodoDto>> findAll() {
        return ResponseEntity.ok(todoService.getAll());
    }

    @GetMapping("/{id}")

    public ResponseEntity<List<Todo>> getById(@PathVariable("id") int id) {
        return ResponseEntity.ok(todoService.findAllByCategoryId(id));
    }

    @PutMapping("/update")
    public ResponseEntity<TodoDto> update(@RequestBody ToDoRequestDto todoDto) {
        return ResponseEntity.ok(todoService.create(todoDto));
    }

    @PostMapping("/byStatus")
    public ResponseEntity<List<Todo>> getByStatus(@RequestBody StatusRequest statusRequest) {
        return ResponseEntity.ok(todoService.findAllByStatus(statusRequest.getStatus()));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        todoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

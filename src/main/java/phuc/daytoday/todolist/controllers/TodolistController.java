package phuc.daytoday.todolist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import phuc.daytoday.todolist.domain.dtos.TodolistDto;
import phuc.daytoday.todolist.services.TodolistService;

import java.util.List;

@RestController
@RequestMapping("/api/todolist")
public class TodolistController {

    private final TodolistService todolistService;

    @Autowired
    public TodolistController(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    @GetMapping()
    public ResponseEntity<List<TodolistDto>> getAllTodolist(){
        List<TodolistDto> result = todolistService.getAllTodolist();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodolistDto> getTodolistById(@PathVariable Long id){
        TodolistDto result = todolistService.getTodolistById(id);
        return ResponseEntity.ok(result);
    }
}

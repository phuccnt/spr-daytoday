package phuc.daytoday.todolist.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phuc.daytoday.todolist.domain.dtos.TodolistDto;
import phuc.daytoday.todolist.domain.entities.Todolist;
import phuc.daytoday.todolist.exceptions.TodoListNotFoundException;
import phuc.daytoday.todolist.mappers.TodolistMapper;
import phuc.daytoday.todolist.repos.TodolistRepository;
import phuc.daytoday.todolist.services.TodolistService;

import java.util.List;
import java.util.Optional;

@Service
public class TodolistServiceImpl implements TodolistService {

    private final TodolistRepository todolistRepository;

    @Autowired
    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public TodolistDto saveTodolist(TodolistDto todolistDto) {
        return null;
    }

    @Override
    public TodolistDto getTodolistById(Long id) {
        Optional<Todolist> todolist = todolistRepository.findById(id);
        if (todolist.isPresent()){
            return TodolistMapper.mapTodolistToDto(todolist.get());
        }
        throw new TodoListNotFoundException(String.format("todolist with id = %s not found",id));
    }

    @Override
    public List<TodolistDto> getAllTodolist() {
        List<Todolist> todolists = todolistRepository.findAll();
        return TodolistMapper.mapTodolistToDto(todolists);
    }

    @Override
    public void deleteTodolist(Long id) {

    }
}

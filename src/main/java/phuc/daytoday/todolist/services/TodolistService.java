package phuc.daytoday.todolist.services;

import phuc.daytoday.todolist.domain.dtos.TodolistDto;

import java.util.List;


public interface TodolistService {

    TodolistDto saveTodolist(TodolistDto todolistDto);

    TodolistDto getTodolistById(Long id);

    List<TodolistDto> getAllTodolist();

    void deleteTodolist(Long id);

}

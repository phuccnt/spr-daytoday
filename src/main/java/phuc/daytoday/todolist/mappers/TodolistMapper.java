package phuc.daytoday.todolist.mappers;


import phuc.daytoday.todolist.domain.dtos.BaseEntityDto;
import phuc.daytoday.todolist.domain.dtos.TodoDto;
import phuc.daytoday.todolist.domain.dtos.TodolistDto;
import phuc.daytoday.todolist.domain.entities.BaseEntity;
import phuc.daytoday.todolist.domain.entities.Todo;
import phuc.daytoday.todolist.domain.entities.Todolist;

import java.util.List;
import java.util.stream.Collectors;

public class TodolistMapper {

    public static Todolist mapTodolistDtoToEntity(TodolistDto todolistDto) {
        return Todolist.builder()
                .id(todolistDto.getId())
                .baseEntity(BaseEntityMapper.mapBaseEntityDtoToEntity(todolistDto.getBaseEntity()))
                .todos(TodoMapper.mapDtosToTodos(todolistDto.getTodos()))
                .build();
    }

    public static TodolistDto mapTodolistToDto(Todolist todolist) {
        return TodolistDto.builder()
                .id(todolist.getId())
                .baseEntity(BaseEntityMapper.mapBaseEntityToDto(todolist.getBaseEntity()))
                .todos(TodoMapper.mapTodosToDtos(todolist.getTodos()))
                .build();
    }


    public static List<Todolist> mapTodolistDtoToEntity(List<TodolistDto> todolistDtos) {
        return todolistDtos.stream()
                .map(todolistDto -> Todolist.builder()
                        .id(todolistDto.getId())
                        .baseEntity(BaseEntityMapper.mapBaseEntityDtoToEntity(todolistDto.getBaseEntity()))
                        .todos(TodoMapper.mapDtosToTodos(todolistDto.getTodos()))
                        .build())
                .collect(Collectors.toList());
    }

    public static List<TodolistDto> mapTodolistToDto(List<Todolist> todolists) {
        return todolists.stream()
                .map(todolist -> TodolistDto.builder()
                        .id(todolist.getId())
                        .baseEntity(BaseEntityMapper.mapBaseEntityToDto(todolist.getBaseEntity()))
                        //.todos(TodoMapper.mapTodosToDtos(todolist.getTodos()))
                        .build())
                .collect(Collectors.toList());
    }


}

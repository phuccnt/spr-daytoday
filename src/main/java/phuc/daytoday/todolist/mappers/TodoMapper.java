package phuc.daytoday.todolist.mappers;

import phuc.daytoday.todolist.domain.dtos.TodoDto;
import phuc.daytoday.todolist.domain.entities.Todo;

import java.util.List;
import java.util.stream.Collectors;

public class TodoMapper {
    public static TodoDto mapTodoToDto(Todo todo) {
        return TodoDto.builder()
                .id(todo.getId())
                .baseEntity(BaseEntityMapper.mapBaseEntityToDto(todo.getBaseEntity()))
                .build();
    }

    public static Todo mapDtoToTodo(TodoDto todoDto) {
        return Todo.builder()
                .id(todoDto.getId())
                .baseEntity(BaseEntityMapper.mapBaseEntityDtoToEntity(todoDto.getBaseEntity()))
                .build();
    }



    public static List<TodoDto> mapTodosToDtos(List<Todo> todos) {
        return todos.stream()
                .map(todo -> TodoDto.builder()
                        .id(todo.getId())
                        .baseEntity(BaseEntityMapper.mapBaseEntityToDto(todo.getBaseEntity()))
                        .build())
                .collect(Collectors.toList());
    }
    public static List<Todo> mapDtosToTodos(List<TodoDto> todoDtos) {
        return todoDtos.stream()
                .map(todoDto -> Todo.builder()
                        .id(todoDto.getId())
                        .baseEntity(BaseEntityMapper.mapBaseEntityDtoToEntity(todoDto.getBaseEntity()))
                        .build())
                .collect(Collectors.toList());
    }
}

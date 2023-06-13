package phuc.daytoday.todolist.domain.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodolistDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("baseEntity")
    private BaseEntityDto baseEntity;

    @JsonProperty("todos")
    private List<TodoDto> todos;
}

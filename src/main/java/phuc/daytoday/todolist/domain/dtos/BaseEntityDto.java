package phuc.daytoday.todolist.domain.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import phuc.daytoday.todolist.domain.enums.Priority;
import phuc.daytoday.todolist.domain.enums.TodoStatus;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseEntityDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("completed_date")
    private LocalDateTime completedDate;

    @JsonProperty("todo_status")
    private TodoStatus todoStatus;

    @JsonProperty("priority")
    private Priority priority;

    @JsonProperty("created_date")
    private LocalDateTime createdDate;

    @JsonProperty("updated_date")
    private LocalDateTime updatedDate;

}
package phuc.daytoday.todolist.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import phuc.daytoday.todolist.domain.enums.Priority;
import phuc.daytoday.todolist.domain.enums.TodoStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "todo_status")
    private TodoStatus todoStatus;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Column(name = "completed_date")
    private LocalDateTime completedDate;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

}

package phuc.daytoday.todolist.domain.entities;

import lombok.*;
import javax.persistence.*;

@Table(name = "todo")
@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private BaseEntity baseEntity;

    @ToString.Exclude
    //each Todo object belongs to a single Todolist
    @ManyToOne
    @JoinColumn(name = "todolist_id")
    private Todolist todolist;
}

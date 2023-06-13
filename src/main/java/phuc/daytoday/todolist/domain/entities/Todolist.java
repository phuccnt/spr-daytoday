package phuc.daytoday.todolist.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "todolist")
@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
public class Todolist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private BaseEntity baseEntity;

    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "todolist")
    private List<Todo> todos;
}

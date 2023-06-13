package phuc.daytoday.todolist.domain.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("baseEntity")
    private BaseEntityDto baseEntity;
}

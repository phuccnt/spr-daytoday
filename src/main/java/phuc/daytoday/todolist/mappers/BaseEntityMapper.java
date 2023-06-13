package phuc.daytoday.todolist.mappers;

import phuc.daytoday.todolist.domain.dtos.BaseEntityDto;
import phuc.daytoday.todolist.domain.entities.BaseEntity;

public class BaseEntityMapper {

    public static BaseEntityDto mapBaseEntityToDto(BaseEntity baseEntity) {
        return BaseEntityDto.builder()
                .name(baseEntity.getName())
                .completedDate(baseEntity.getCompletedDate())
                .todoStatus(baseEntity.getTodoStatus())
                .priority(baseEntity.getPriority())
                .createdDate(baseEntity.getCreatedDate())
                .updatedDate(baseEntity.getUpdatedDate())
                .build();
    }

    public static BaseEntity mapBaseEntityDtoToEntity(BaseEntityDto baseEntityDto) {
        return BaseEntity.builder()
                .name(baseEntityDto.getName())
                .completedDate(baseEntityDto.getCompletedDate())
                .todoStatus(baseEntityDto.getTodoStatus())
                .priority(baseEntityDto.getPriority())
                .createdDate(baseEntityDto.getCreatedDate())
                .updatedDate(baseEntityDto.getUpdatedDate())
                .build();
    }
}

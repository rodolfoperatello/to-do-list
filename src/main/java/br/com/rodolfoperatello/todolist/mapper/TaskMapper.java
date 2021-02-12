package br.com.rodolfoperatello.todolist.mapper;

import br.com.rodolfoperatello.todolist.controller.request.TaskRequest;
import br.com.rodolfoperatello.todolist.controller.response.TaskResponse;
import br.com.rodolfoperatello.todolist.entity.TaskEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TaskMapper {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static TaskEntity requestToEntity(TaskRequest taskRequest) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setDescription(taskRequest.getDescription());
        taskEntity.setTag(taskRequest.getDescription());
        taskEntity.setLocalDateTime(LocalDateTime.parse(taskRequest.getDate(), formatter));
        return taskEntity;
    }

    public static TaskResponse entityToResponse(TaskEntity taskEntity) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setDescription(taskEntity.getDescription());
        taskResponse.setTag(taskEntity.getTag());
        taskResponse.setLocalDateTime(taskEntity.getLocalDateTime());
        taskResponse.setUserResponse(UserMapper.entityToResponse(taskEntity.getUserEntity()));
        return taskResponse;
    }
}

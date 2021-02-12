package br.com.rodolfoperatello.todolist.service;

import br.com.rodolfoperatello.todolist.controller.request.TaskRequest;
import br.com.rodolfoperatello.todolist.controller.response.TaskResponse;
import br.com.rodolfoperatello.todolist.entity.TaskEntity;
import br.com.rodolfoperatello.todolist.entity.UserEntity;
import br.com.rodolfoperatello.todolist.mapper.TaskMapper;
import br.com.rodolfoperatello.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserService userService;

    public TaskService(TaskRepository taskRepository, UserService userService) {
        this.taskRepository = taskRepository;
        this.userService = userService;
    }

    @Transactional
    public TaskResponse saveTask(TaskRequest taskRequest) {
        return TaskMapper.entityToResponse(taskRepository.save(createTaskEntity(taskRequest)));
    }

    private TaskEntity createTaskEntity(TaskRequest taskRequest) {
        TaskEntity taskEntity = TaskMapper.requestToEntity(taskRequest);
        taskEntity.setUserEntity(findUser(taskRequest.getUserId()));
        return taskEntity;
    }

    private UserEntity findUser(Long userId) {
        return userService.findUser(userId);
    }
}

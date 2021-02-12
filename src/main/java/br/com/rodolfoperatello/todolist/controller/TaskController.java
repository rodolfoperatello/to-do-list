package br.com.rodolfoperatello.todolist.controller;

import br.com.rodolfoperatello.todolist.controller.request.TaskRequest;
import br.com.rodolfoperatello.todolist.controller.response.TaskResponse;
import br.com.rodolfoperatello.todolist.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;
    private static final Logger LOG = LoggerFactory.getLogger(TaskController.class);

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<TaskResponse> createTask(@RequestBody @Valid TaskRequest taskRequest){
        return new ResponseEntity<>(taskService.saveTask(taskRequest), HttpStatus.CREATED);
    }

}

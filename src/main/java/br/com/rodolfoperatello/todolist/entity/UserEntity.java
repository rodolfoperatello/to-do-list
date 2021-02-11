package br.com.rodolfoperatello.todolist.entity;

import java.util.List;

public class UserEntity {

    private Long id;
    private String firstName;
    private String lastName;
    private List<TaskEntity> taskEntityList;

    public UserEntity(String firstName, String lastName, List<TaskEntity> taskEntityList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.taskEntityList = taskEntityList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<TaskEntity> getTaskEntityList() {
        return taskEntityList;
    }

    public void setTaskEntityList(List<TaskEntity> taskEntityList) {
        this.taskEntityList = taskEntityList;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", taskEntityList=" + taskEntityList +
                '}';
    }
}

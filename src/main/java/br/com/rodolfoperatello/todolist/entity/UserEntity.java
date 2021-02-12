package br.com.rodolfoperatello.todolist.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "task")
    private List<TaskEntity> taskEntityList;

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

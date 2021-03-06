package br.com.rodolfoperatello.todolist.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String tag;
    @Column(name = "date")
    private LocalDateTime localDateTime;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Override
    public String toString() {
        return "TaskEntity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", localDateTime=" + localDateTime +
                ", userEntity=" + userEntity +
                '}';
    }
}

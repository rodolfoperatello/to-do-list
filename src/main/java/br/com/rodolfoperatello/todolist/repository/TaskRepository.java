package br.com.rodolfoperatello.todolist.repository;

import br.com.rodolfoperatello.todolist.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}

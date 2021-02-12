package br.com.rodolfoperatello.todolist.repository;

import br.com.rodolfoperatello.todolist.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

package br.com.rodolfoperatello.todolist.service;

import br.com.rodolfoperatello.todolist.entity.UserEntity;
import br.com.rodolfoperatello.todolist.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity findUser(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Erro"));
    }
}

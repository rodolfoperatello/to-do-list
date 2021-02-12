package br.com.rodolfoperatello.todolist.mapper;

import br.com.rodolfoperatello.todolist.controller.response.UserResponse;
import br.com.rodolfoperatello.todolist.entity.UserEntity;

public class UserMapper {

    public static UserResponse entityToResponse(UserEntity userEntity) {
        UserResponse userResponse = new UserResponse();
        userResponse.setFullName(userEntity.getFirstName().concat(" ").concat(userEntity.getLastName()));
        return userResponse;
    }
}

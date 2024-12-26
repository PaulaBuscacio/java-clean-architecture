package br.com.alura.codechella.infra.mapper;

import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.infra.presistance.UserEntity;

public class UserEntityMapper {

    public User toDomain(UserEntity entity) {
        return new User(entity.getCpf(), entity.getName(), entity.getBirthday(), entity.getEmail());
    }

    public UserEntity toEntity(User user) {
        return new UserEntity(user.getCpf(), user.getName(), user.getBirthday(), user.getEmail());
    }
}

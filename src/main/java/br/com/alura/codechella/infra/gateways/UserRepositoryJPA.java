package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.app.gateways.UserRepository;
import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.infra.mapper.UserEntityMapper;
import br.com.alura.codechella.infra.presistance.UserEntity;
import br.com.alura.codechella.infra.presistance.UserEntityRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryJPA implements UserRepository {

    private final UserEntityRepository userEntityRepository;

    private final UserEntityMapper mapper;

    public UserRepositoryJPA(UserEntityRepository userEntityRepository, UserEntityMapper mapper) {
        this.userEntityRepository = userEntityRepository;
        this.mapper = mapper;
    }

    @Override
    public User save(User user) {
      UserEntity entity = userEntityRepository.save(mapper.toEntity(user));
         return mapper.toDomain(entity);
    }

    @Override
    public List<User> listUsers() {
        List<UserEntity> userEntityRepositories = userEntityRepository.findAll();
        return userEntityRepositories.stream().map(mapper::toDomain).toList();
    }
}

package br.com.alura.codechella.config;

import br.com.alura.codechella.app.gateways.UserRepository;
import br.com.alura.codechella.infra.controller.UserController;
import br.com.alura.codechella.infra.gateways.UserRepositoryJPA;
import br.com.alura.codechella.infra.mapper.UserEntityMapper;
import br.com.alura.codechella.infra.presistance.UserEntityRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserInfraConfig {

    @Bean
    public UserController userController(UserRepository userRepository) {
        return new UserController(userRepository);
    }

    @Bean
    public UserRepository userRepository(UserEntityRepository userEntityRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryJPA(userEntityRepository, userEntityMapper);
    }

    @Bean
    public UserEntityMapper userEntityMapper(){
        return new UserEntityMapper();
    }
}

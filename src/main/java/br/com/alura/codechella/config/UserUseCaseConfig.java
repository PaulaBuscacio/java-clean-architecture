package br.com.alura.codechella.config;

import br.com.alura.codechella.app.gateways.UserRepository;
import br.com.alura.codechella.app.usecases.RetrieveUsersUseCase;
import br.com.alura.codechella.app.usecases.SaveUserUseCase;
import br.com.alura.codechella.app.usecases.impl.RetrieveUsersUseCaseImpl;
import br.com.alura.codechella.app.usecases.impl.SaveUserUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserUseCaseConfig {

    @Bean
    public RetrieveUsersUseCase retrieveUsersUseCase(UserRepository userRepository){
        return new RetrieveUsersUseCaseImpl(userRepository);

    }

    @Bean
    public SaveUserUseCase saveUserUseCase(UserRepository userRepository){
        return new SaveUserUseCaseImpl(userRepository);
    }


}

package br.com.alura.codechella.app.usecases.impl;

import br.com.alura.codechella.app.usecases.RetrieveUsersUseCase;
import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.app.gateways.UserRepository;

import java.util.List;

public class RetrieveUsersUseCaseImpl implements RetrieveUsersUseCase {

    private final UserRepository userRepository;

    public RetrieveUsersUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<User> listUsers() {
        return userRepository.listUsers();
    }
}

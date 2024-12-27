package br.com.alura.codechella.app.usecases.impl;

import br.com.alura.codechella.app.usecases.SaveUserUseCase;
import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.app.gateways.UserRepository;

public class SaveUserUseCaseImpl implements SaveUserUseCase {

    private final UserRepository userRepository;

    public SaveUserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}

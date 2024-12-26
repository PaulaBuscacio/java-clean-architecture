package br.com.alura.codechella.app.usecases;

import br.com.alura.codechella.domain.entities.user.User;

import java.util.List;

public interface RetrieveUsersUseCase {

    List<User> listUsers();
}

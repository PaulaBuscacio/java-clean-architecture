package br.com.alura.codechella.app.gateways;

import br.com.alura.codechella.domain.entities.user.User;

import java.util.List;

public interface UserRepository {

    User save(User user);

    List<User> listUsers();
}

package br.com.alura.codechella.naousar.service;

import br.com.alura.codechella.infra.presistance.UserEntity;

import java.util.List;

public interface UsuarioService {
    UserEntity cadastrarUsuario(UserEntity userEntity);

    List<UserEntity> listarTodos();
}

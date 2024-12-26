package br.com.alura.codechella.naousar.service;

import br.com.alura.codechella.infra.presistance.UserEntity;
import br.com.alura.codechella.infra.presistance.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UserEntityRepository repository;

    @Override
    public UserEntity cadastrarUsuario(UserEntity userEntity) {
        return repository.save(userEntity);
    }

    @Override
    public List<UserEntity> listarTodos() {
        return repository.findAll();
    }
}

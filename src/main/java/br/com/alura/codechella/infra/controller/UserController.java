package br.com.alura.codechella.infra.controller;

import br.com.alura.codechella.app.gateways.UserRepository;
import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.infra.controller.dtos.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO, UriComponentsBuilder uriComponentsBuilder){
        User userSaved = userRepository.save(new User(userDTO.cpf(), userDTO.name(),  userDTO.birthday(), userDTO.email()));
        UserDTO dto = new UserDTO(userSaved.getCpf(), userSaved.getName(), userSaved.getBirthday(), userDTO.email());
        var uri = uriComponentsBuilder.path("/users/{id}").buildAndExpand(userSaved.getId()).toUri();

        return ResponseEntity.created(uri).body(dto);

    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> listUsers() {
        List<UserDTO> dtos = userRepository.listUsers().stream()
                .map(u -> new UserDTO(u.getCpf(), u.getName(), u.getBirthday(), u.getEmail()))
                .collect(Collectors.toList());
        return  ResponseEntity.ok(dtos);
    }
}

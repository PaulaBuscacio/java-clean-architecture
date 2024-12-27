package br.com.alura.codechella.infra.controller.dtos;

import java.time.LocalDate;

public record UserDTO(
        String cpf,
        String name,
        LocalDate birthday,
        String email
) {}

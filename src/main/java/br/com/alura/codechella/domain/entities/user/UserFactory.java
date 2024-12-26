package br.com.alura.codechella.domain.entities.user;

import br.com.alura.codechella.domain.Address;

import java.time.LocalDate;

public class UserFactory {

    private User user;

    public User createUserWithNameCpfAndBirthday(String name, String cpf, LocalDate birthday) {
        this.user = new User(name, cpf, birthday, "");
        return this.user;
    }

    public User insertAddress(String cep, String number, String complement){
       this.user.setAddress(new Address(cep, number, complement));
       return this.user;
    }
}

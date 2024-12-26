package br.com.alura.codechella.domain.entities.user;

import br.com.alura.codechella.domain.Address;

import java.time.LocalDate;

//builder pattern
public class UserBuilder {

    private User user;

    public User createUserWithNameCpfBirthdayAndEmail(String name, String cpf, LocalDate birthday, String email) {
        this.user = new User(cpf,name, birthday, email);
        return this.user;
    }

    public User insertAddress(String cep, String number, String complement){
       this.user.setAddress(new Address(cep, number, complement));
       return this.user;
    }
}

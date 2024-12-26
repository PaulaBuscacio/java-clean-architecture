package br.com.alura.codechella.domain.entities.user;

import br.com.alura.codechella.domain.Address;

import java.time.LocalDate;

public class User {
    private Long id;
    private String cpf;
    private String name;
    private LocalDate birthday;
    private String email;

    private Address address;

    public User(String cpf, String name, LocalDate birthday, String email) {
        if(cpf == null || !(cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}"))){
            throw new IllegalArgumentException("invalid cpf format");
        }
        if(email == null || !(email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$"))) {
            throw new IllegalArgumentException("invalid email format");
        }
        this.cpf = cpf;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

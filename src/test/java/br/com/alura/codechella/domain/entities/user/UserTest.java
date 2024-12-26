package br.com.alura.codechella.domain.entities.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void shouldThrowExceptionWhenCpfIsInvalid(){
        assertThrows(IllegalArgumentException.class, () ->
                new User("98878788-11", "User Test", LocalDate.parse("1980-08-08"),"test@test.com"));
        assertThrows(IllegalArgumentException.class, () ->
                new User("", "User Test", LocalDate.parse("1980-08-08"),"test@test.com"));
        assertThrows(IllegalArgumentException.class, () ->
                new User(null, "User Test", LocalDate.parse("1980-08-08"),"test@test.com"));
    }

    @Test
    public void shouldThrowExceptionWhenEmailIsInvalid(){
       assertThrows(IllegalArgumentException.class, () ->
                new User("123.456.789-00", "User Test", LocalDate.parse("1980-08-08"),"test"));
       assertThrows(IllegalArgumentException.class, () ->
                new User("123.456.789-00", "User Test", LocalDate.parse("1980-08-08"),"test@test"));
       assertThrows(IllegalArgumentException.class, () ->
                new User("123.456.789-00", "User Test", LocalDate.parse("1980-08-08"),""));
    }

    @Test
    public void shouldCreateUserWithAddressAndBuilderPattern() {
       UserBuilder builder = new UserBuilder();
       builder.createUserWithNameCpfBirthdayAndEmail("Test user", "998.765.432-11", LocalDate.parse("2010-01-01"), "test@mail.com");
       User user = builder.insertAddress("00000-000", "22b","bloco z");

        assertEquals("Test user", user.getName());
        assertEquals("bloco z", user.getAddress().getComplement());
    }
}

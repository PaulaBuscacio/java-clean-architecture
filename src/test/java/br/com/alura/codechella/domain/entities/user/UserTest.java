package br.com.alura.codechella.domain.entities.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserTest {

    @Test
    public void shouldThrowExceptionWhenCpfIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new User("98878788-11", "User Test", LocalDate.parse("1980-08-08"),"test@test.com"));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new User("", "User Test", LocalDate.parse("1980-08-08"),"test@test.com"));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new User(null, "User Test", LocalDate.parse("1980-08-08"),"test@test.com"));
    }

    @Test
    public void shouldThrowExceptionWhenEmailIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new User("123.456.789-00", "User Test", LocalDate.parse("1980-08-08"),"test"));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new User("123.456.789-00", "User Test", LocalDate.parse("1980-08-08"),"test@test"));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new User("123.456.789-00", "User Test", LocalDate.parse("1980-08-08"),""));
    }
}

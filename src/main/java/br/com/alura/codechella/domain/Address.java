package br.com.alura.codechella.domain;

public class Address {

    private String cep;
    private String number;
    private String complement;

    public Address(String cep, String number, String complement) {
        this.cep = cep;
        this.number = number;
        this.complement = complement;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}

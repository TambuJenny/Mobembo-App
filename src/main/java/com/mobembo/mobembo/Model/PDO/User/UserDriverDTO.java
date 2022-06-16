package com.mobembo.mobembo.Model.PDO.User;


import com.mobembo.mobembo.Model.Enum.GenreEnum;

import org.springframework.lang.Nullable;

public class UserDriverDTO {
    
    private String PrimeiroNome;
    private String UltimoNome;
    private int Telefone;
    private String Morada;
    private GenreEnum Genero;
    private String Email;
    private String BI;

    @Nullable
    private String Senha;
    private boolean ContaAtivo;


    public boolean isContaAtivo() {
        return ContaAtivo;
    }
    public void setContaAtivo(boolean contaAtivo) {
        ContaAtivo = contaAtivo;
    }
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
    public String getPrimeiroNome() {
        return PrimeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome) {
        PrimeiroNome = primeiroNome;
    }
    public String getUltimoNome() {
        return UltimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        UltimoNome = ultimoNome;
    }
    public int getTelefone() {
        return Telefone;
    }
    public void setTelefone(int telefone) {
        Telefone = telefone;
    }
    public String getMorada() {
        return Morada;
    }
    public void setMorada(String morada) {
        Morada = morada;
    }
    public GenreEnum getGenero() {
        return Genero;
    }
    public void setGenero(GenreEnum genero) {
        Genero = genero;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getBI() {
        return BI;
    }
    public void setBI(String bI) {
        BI = bI;
    }

}

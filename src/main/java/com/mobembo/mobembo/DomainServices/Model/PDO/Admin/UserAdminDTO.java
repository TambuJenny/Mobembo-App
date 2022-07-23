package com.mobembo.mobembo.DomainServices.Model.PDO.Admin;

import com.mobembo.mobembo.DomainServices.Model.Enum.GenreEnum;
import com.mobembo.mobembo.DomainServices.Model.Enum.SessionEnum;

public class UserAdminDTO {
    private String PrimeiroNome;
    private String UltimoNome;
    private int Telefone;
    private String Morada;
    private GenreEnum Genero;
    private String Email;
    private String BI;

    private String Senha;
    private SessionEnum EstadoSessão ;


   
    public SessionEnum getEstadoSessão() {
        return EstadoSessão;
    }
    public void setEstadoSessão(SessionEnum estadoSessão) {
        EstadoSessão = estadoSessão;
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

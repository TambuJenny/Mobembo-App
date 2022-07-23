package com.mobembo.mobembo.DomainServices.Model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mobembo.mobembo.DomainServices.Model.Enum.GenreEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Person")

public class PersonModel {
    
    @javax.persistence.Id
    private String Id;

    private String PrimeiroNome;
    private String UltimoNome;
    private String BI;
    private int Telefone;
    private String Morada;
    private GenreEnum Genero;
    private String Email;

    private LocalDateTime CreateDate = LocalDateTime.now() ;
    private LocalDateTime UpdateDate = LocalDateTime.now() ;

   
    public LocalDateTime getCreateDate() {
        return CreateDate;
    }
    public void setCreateDate(LocalDateTime createDate) {
        CreateDate = createDate;
    }
    public LocalDateTime getUpdateDate() {
        return UpdateDate;
    }
    public void setUpdateDate(LocalDateTime updateDate) {
        UpdateDate = updateDate;
    }

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getPrimeiroNome() {
        return PrimeiroNome;
    }
    public void setPrimeiroNome(String nome) {
        PrimeiroNome = nome;
    }
    public String getUltimoNome() {
        return UltimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        UltimoNome = ultimoNome;
    }
    public String getBI() {
        return BI;
    }
    public void setBI(String bI) {
        BI = bI;
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
}

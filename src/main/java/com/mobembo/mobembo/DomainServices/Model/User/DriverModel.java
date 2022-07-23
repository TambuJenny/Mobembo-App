package com.mobembo.mobembo.DomainServices.Model.User;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mobembo.mobembo.DomainServices.Model.PersonModel;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserDriver")
public class DriverModel {
    
    @javax.persistence.Id
    private String Id;

    private String NumeroCarta;
    @Nullable
    private String Senha;
    private boolean ActiveAccount; 

    @OneToOne(cascade = CascadeType.ALL)
    private PersonModel Pessoa;
    
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }

    public boolean isActiveAccount() {
        return ActiveAccount;
    }
    public void setActiveAccount(boolean activeAccount) {
        ActiveAccount = activeAccount;
    }
    
    public PersonModel getPessoa() {
        return Pessoa;
    }
    public void setPessoa(PersonModel pessoa) {
        Pessoa = pessoa;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getNumeroCarta() {
        return NumeroCarta;
    }
    public void setNumeroCarta(String numeroCarta) {
        NumeroCarta = numeroCarta;
    }
}

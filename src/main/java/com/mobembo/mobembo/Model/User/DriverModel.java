package com.mobembo.mobembo.Model.User;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mobembo.mobembo.Model.PersonModel;


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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;

    private String NumeroCarta;
    
    @OneToOne
    private PersonModel Pessoa;

    public PersonModel getPessoa() {
        return Pessoa;
    }
    public void setPessoa(PersonModel pessoa) {
        Pessoa = pessoa;
    }
    public UUID getId() {
        return Id;
    }
    public void setId(UUID id) {
        Id = id;
    }
    public String getNumeroCarta() {
        return NumeroCarta;
    }
    public void setNumeroCarta(String numeroCarta) {
        NumeroCarta = numeroCarta;
    }
}

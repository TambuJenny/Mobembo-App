package com.mobembo.mobembo.Model.User;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
    private String Id;

    private String NumeroCarta;
    
    @OneToOne(cascade = CascadeType.ALL)
    private PersonModel Pessoa;

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

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
@Table(name = "UserClient")
public class ClientModel {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;

    @OneToOne
    private PersonModel Pessoa;

    public PersonModel getPerson() {
        return Pessoa;
    }
    public void setPerson(PersonModel pessoa) {
        Pessoa = pessoa;
    }
    public UUID getId() {
        return Id;
    }
    public void setId(UUID id) {
        Id = id;
    }
}

package com.mobembo.mobembo.Model.User;

import java.time.LocalDateTime;

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
@Table(name = "UserClients")
public class ClientModel {

    @javax.persistence.Id
    private String Id;

    @OneToOne(cascade = CascadeType.ALL)
    private PersonModel Pessoa;

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
    public PersonModel getPessoa() {
        return Pessoa;
    }
    public void setPessoa(PersonModel pessoa) {
        Pessoa = pessoa;
    }

    public PersonModel getPerson() {
        return Pessoa;
    }
    public void setPerson(PersonModel pessoa) {
        Pessoa = pessoa;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
}

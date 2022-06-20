package com.mobembo.mobembo.Model.Admin;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mobembo.mobembo.Model.PersonModel;
import com.mobembo.mobembo.Model.Enum.SessionEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserAdmin")
public class UserAdminModel {
    
    @javax.persistence.Id
    private String Id;
    private String Senha;
    private SessionEnum EstadoSessão  = SessionEnum.Ativo;
    
  

    @OneToOne
    private PersonModel Pessoa; 

    public String getId() {
        return Id;
    }

    public SessionEnum getEstadoSessão() {
        return EstadoSessão;
    }

    public void setEstadoSessão(SessionEnum estadoSessão) {
        EstadoSessão = estadoSessão;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public PersonModel getPessoa() {
        return Pessoa;
    }

    public void setPessoa(PersonModel pessoa) {
        Pessoa = pessoa;
    }

}

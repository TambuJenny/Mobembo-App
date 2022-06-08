package com.mobembo.mobembo.Model.User;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="MaterialGood")
public class MaterialGoodModel {
    
    @Id
    @GeneratedValue
    private UUID Id;

    private String Cor;
    private float Peso;
    private String Descricao;
    
    @OneToOne
    private ClientModel Cliente;


    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public ClientModel getPessoa() {
        return Cliente;
    }

    public void setPessoa(ClientModel cliente) {
        Cliente = cliente;
    }
}

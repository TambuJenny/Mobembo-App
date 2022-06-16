package com.mobembo.mobembo.Model.User;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
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
    private String Id;

    private String Cor;
    private float Peso;
    private String Descricao;
    
    @OneToOne(cascade = CascadeType.ALL)
    private ClientModel Cliente;

    private LocalDateTime CreateDate = LocalDateTime.now() ;
    private LocalDateTime UpdateDate = LocalDateTime.now() ;

    public ClientModel getCliente() {
        return Cliente;
    }

    public void setCliente(ClientModel cliente) {
        Cliente = cliente;
    }

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

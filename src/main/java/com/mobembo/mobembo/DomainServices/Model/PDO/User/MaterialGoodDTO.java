package com.mobembo.mobembo.DomainServices.Model.PDO.User;

public class MaterialGoodDTO {
    
    private String Cor;
    private float Peso;
    private String Descricao;
    private String IdCliente;


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
    public String getIdCliente() {
        return IdCliente;
    }
    public void setIdCliente(String idCliente) {
        IdCliente = idCliente;
    }
}

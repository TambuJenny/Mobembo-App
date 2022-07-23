package com.mobembo.mobembo.DomainServices.Model.Request.Admin;

public class LoginRequest {
    
    private String Senha;
    private String  Email;

    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
}

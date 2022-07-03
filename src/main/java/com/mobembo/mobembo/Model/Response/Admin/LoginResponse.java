package com.mobembo.mobembo.Model.Response.Admin;

import com.mobembo.mobembo.Model.Enum.LoginEnum;

public class LoginResponse {

    private String Nome;
    private LoginEnum Estado;
    private String Email;
    private String IdUserAdmin;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public LoginEnum getEstado() {
        return Estado;
    }
    public void setEstado(LoginEnum estado) {
        Estado = estado;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getIdUserAdmin() {
        return IdUserAdmin;
    }
    public void setIdUserAdmin(String idUserAdmin) {
        IdUserAdmin = idUserAdmin;
    }
}

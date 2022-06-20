package com.mobembo.mobembo.Model.Admin;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mobembo.mobembo.Model.Enum.SessionEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Travel")
public class TravelModel {
    
    @javax.persistence.Id
    private String Id;

    private String Origin;
    private String Destino; 
    private SessionEnum Estado;
    private String DiaSemana;
    private int Quantidade; 
    private LocalDateTime DataHoraPartida = LocalDateTime.now();

    @OneToOne
    private UserAdminModel Admin; 

    private LocalDateTime CreateDate = LocalDateTime.now();
    private LocalDateTime UpdateDate = LocalDateTime.now();

    public UserAdminModel getAdmin() {
        return Admin;
    }

    public void setAdmin(UserAdminModel admin) {
        Admin = admin;
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

    public SessionEnum isEstado() {
        return Estado;
    }

    public void setEstado(SessionEnum estado) {
        Estado = estado;
    }

    public String getDiaSemana() {
        return DiaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        DiaSemana = diaSemana;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public LocalDateTime getDataHoraPartida() {
        return DataHoraPartida;
    }

    public void setDataHoraPartida(LocalDateTime dataHoraPartida) {
        DataHoraPartida = dataHoraPartida;
    }

}

package com.mobembo.mobembo.DomainServices.Model.Admin;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mobembo.mobembo.DomainServices.Model.Enum.StateTravelEnum;

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

    private String Origin ;
    private String Destino ;
    private String DiaSemana;
    private String HoraPartida;
    private int Dia;
    private String Mes;
    private int Ano;
    private StateTravelEnum EstadoViagem;
    private float PrecoNormal;
    private float PrecoVip;
    private int Lugar; 
  
    @OneToOne()
    private UserAdminModel Admin;

    private LocalDateTime CreateDate = LocalDateTime.now() ;
    private LocalDateTime UpdateDate = LocalDateTime.now() ;

    public String getMes() {
        return Mes;
    }
    public void setMes(String mes) {
        Mes = mes;
    }
    public int getAno() {
        return Ano;
    }
    public void setAno(int ano) {
        Ano = ano;
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
    public String getDiaSemana() {
        return DiaSemana;
    }
    public void setDiaSemana(String diaSemana) {
        DiaSemana = diaSemana;
    }
    public String getHoraPartida() {
        return HoraPartida;
    }
    public void setHoraPartida(String horaPartida) {
        HoraPartida = horaPartida;
    }
    public float getPrecoNormal() {
        return PrecoNormal;
    }
    public void setPrecoNormal(float precoNormal) {
        PrecoNormal = precoNormal;
    }
    public float getPrecoVip() {
        return PrecoVip;
    }
    public void setPrecoVip(float precoVip) {
        PrecoVip = precoVip;
    }
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

    public StateTravelEnum getEstadoViagem() {
        return EstadoViagem;
    }
    public void setEstadoViagem(StateTravelEnum estadoViagem) {
        EstadoViagem = estadoViagem;
    }

    public int getDia() {
        return Dia;
    }
    public void setDia(int dia) {
        Dia = dia;
    }
    public int getLugar() {
        return Lugar;
    }
    public void setLugar(int lugar) {
        Lugar = lugar;
    }
    
}

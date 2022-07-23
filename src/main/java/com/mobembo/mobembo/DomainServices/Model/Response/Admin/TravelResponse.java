package com.mobembo.mobembo.DomainServices.Model.Response.Admin;

import com.mobembo.mobembo.DomainServices.Model.Enum.StateTravelEnum;

public class TravelResponse {
    
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
    private String IdAdmin;
    private int Lugar; 

    public int getLugar() {
        return Lugar;
    }
    public void setLugar(int lugar) {
        Lugar = lugar;
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
    public int getDia() {
        return Dia;
    }
    public void setDia(int dia) {
        Dia = dia;
    }
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
    public StateTravelEnum getEstadoViagem() {
        return EstadoViagem;
    }
    public void setEstadoViagem(StateTravelEnum estadoViagem) {
        EstadoViagem = estadoViagem;
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
    public String getIdAdmin() {
        return IdAdmin;
    }
    public void setIdAdmin(String idAdmin) {
        IdAdmin = idAdmin;
    }
    
}

package com.mobembo.mobembo.Model.Request.Admin;

import com.mobembo.mobembo.Model.Enum.StateTravelEnum;

public class TravelRequest {
    
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

    public String getIdAdmin() {
        return IdAdmin;
    }
    public void setIdAdmin(String idAdmin) {
        IdAdmin = idAdmin;
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

}

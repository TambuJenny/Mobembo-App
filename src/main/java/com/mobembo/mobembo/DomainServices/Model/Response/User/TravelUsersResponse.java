package com.mobembo.mobembo.DomainServices.Model.Response.User;

import com.mobembo.mobembo.DomainServices.Model.Enum.StateTravelEnum;

public class TravelUsersResponse {
    
    private String IdViagem; 
    private StateTravelEnum  EstadoViagem;
    private String Destino;
    private String Origim;
    private float Preco;
    private String Mes;
    private int Ano;
    private int Dia;
    private String DiaSemana;
    private String HoraPartida;

    private String PNome;
    private String UNome;
    private int Telefone;
    
    public String getHoraPartida() {
        return HoraPartida;
    }

    public void setHoraPartida(String horaPartida) {
        HoraPartida = horaPartida;
    }

    public String getPNome() {
        return PNome;
    }

    public void setPNome(String pNome) {
        PNome = pNome;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public String getUNome() {
        return UNome;
    }

    public void setUNome(String uNome) {
        UNome = uNome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public StateTravelEnum isEstadoViagem() {
        return EstadoViagem;
    }

    public void setEstadoViagem(StateTravelEnum estadoViagem) {
        EstadoViagem = estadoViagem;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getOrigim() {
        return Origim;
    }

    public void setOrigim(String origim) {
        Origim = origim;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float preco) {
        Preco = preco;
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

    public String getDiaSemana() {
        return DiaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        DiaSemana = diaSemana;
    }

    public String getIdViagem() {
        return IdViagem;
    }

    public void setIdViagem(String idViagem) {
        IdViagem = idViagem;
    }

}

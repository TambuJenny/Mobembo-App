package com.mobembo.mobembo.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mobembo.mobembo.Model.Enum.GenreEnum;
import com.mobembo.mobembo.Model.User.ClientModel;
import com.mobembo.mobembo.Model.User.DriverModel;
import com.mobembo.mobembo.Model.User.MaterialGoodModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Person")

public class PersonModel {
    
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;

    private String PrimeiroNome;
    private String UltimoNome;
    private String BI;
    private int Telefone;
    private String Morada;
    private GenreEnum Genero;
    private String Email;

    @OneToOne
    private DriverModel Motorista ;
    @OneToOne
    private MaterialGoodModel BemMateriais;
    @OneToOne
    private ClientModel Cliente;


    public UUID getId() {
        return Id;
    }
    public void setId(UUID id) {
        Id = id;
    }
    public String getPrimeiroNome() {
        return PrimeiroNome;
    }
    public void setPrimeiroNome(String nome) {
        PrimeiroNome = nome;
    }
    public String getUltimoNome() {
        return UltimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        UltimoNome = ultimoNome;
    }
    public String getBI() {
        return BI;
    }
    public void setBI(String bI) {
        BI = bI;
    }
    public int getTelefone() {
        return Telefone;
    }
    public void setTelefone(int telefone) {
        Telefone = telefone;
    }
    public String getMorada() {
        return Morada;
    }
    public void setMorada(String morada) {
        Morada = morada;
    }
    public GenreEnum getGenero() {
        return Genero;
    }
    public void setGenero(GenreEnum genero) {
        Genero = genero;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
}

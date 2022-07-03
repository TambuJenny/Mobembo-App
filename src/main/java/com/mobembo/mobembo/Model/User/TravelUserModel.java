package com.mobembo.mobembo.Model.User;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mobembo.mobembo.Model.Admin.TravelModel;
import com.mobembo.mobembo.Model.Enum.StateTravelEnum;

@Entity
@Table(name="TravelUser")
public class TravelUserModel {
    
    @javax.persistence.Id
    private String Id;
    
    @OneToOne
    private ClientModel UserClient;
    @OneToOne
    private TravelModel Travel;
    
    private String CodigoViagem;
    private StateTravelEnum EstadoViagem; 

    private LocalDateTime CreateDate = LocalDateTime.now() ;
    private LocalDateTime UpdateDate = LocalDateTime.now() ;


    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public ClientModel getUserClient() {
        return UserClient;
    }
    public void setUserClient(ClientModel userClientId) {
        UserClient = userClientId;
    }
    public TravelModel getTravel() {
        return Travel;
    }
    public void setTravel(TravelModel travelId) {
        Travel = travelId;
    }
    public String getCodigoViagem() {
        return CodigoViagem;
    }
    public void setCodigoViagem(String codigoViagem) {
        CodigoViagem = codigoViagem;
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
   
}

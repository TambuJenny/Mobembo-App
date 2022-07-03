package com.mobembo.mobembo.Model.PDO.User;

import com.mobembo.mobembo.Model.Admin.TravelModel;
import com.mobembo.mobembo.Model.Enum.StateTravelEnum;

public class TravelUserDTO {
    
    private String UserClientId;
    private String TravelId;
    private String CodigoViagem;
    private StateTravelEnum EstadoViagem; 
    
    public String getUserClientId() {
        return UserClientId;
    }
    public void setUserClientId(String userClientId) {
        UserClientId = userClientId;
    }
    public String getTravelId() {
        return TravelId;
    }
    public void setTravelId(String travelId) {
        TravelId = travelId;
    }
    public String getCodigoViagem() {
        return CodigoViagem;
    }
    public void setCodigoViagem(String codigoViagem) {
        CodigoViagem = codigoViagem;
    }
    public StateTravelEnum getEstadoViagem() {
        return EstadoViagem;
    }
    public void setEstadoViagem(StateTravelEnum estadoViagem) {
        EstadoViagem = estadoViagem;
    }

}

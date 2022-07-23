package com.mobembo.mobembo.DomainServices.Interfaces.User;

import com.mobembo.mobembo.DomainServices.Model.PDO.User.TravelUserDTO;
import com.mobembo.mobembo.DomainServices.Model.Response.User.TravelPlaceResponse;
import com.mobembo.mobembo.DomainServices.Model.Response.User.TravelUsersResponse;

import org.springframework.http.ResponseEntity;

public interface TravelUserInterface {
    
    ResponseEntity<TravelUserDTO> Create(TravelUserDTO travelUser);
    ResponseEntity<TravelUserDTO> Update(String codigoViagem);
    ResponseEntity<TravelPlaceResponse> Getplace(String idviagem);
    ResponseEntity<TravelUsersResponse> GetTravelUser(String codigoViagem);
}

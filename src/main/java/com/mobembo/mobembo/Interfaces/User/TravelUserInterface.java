package com.mobembo.mobembo.Interfaces.User;

import com.mobembo.mobembo.Model.PDO.User.TravelUserDTO;
import com.mobembo.mobembo.Model.Response.User.TravelPlaceResponse;
import com.mobembo.mobembo.Model.Response.User.TravelUsersResponse;

import org.springframework.http.ResponseEntity;

public interface TravelUserInterface {
    
    ResponseEntity<TravelUserDTO> Create(TravelUserDTO travelUser);
    ResponseEntity<TravelUserDTO> Update(String codigoViagem);
    ResponseEntity<TravelPlaceResponse> Getplace(String idviagem);
    ResponseEntity<TravelUsersResponse> GetTravelUser(String codigoViagem);
}

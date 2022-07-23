package com.mobembo.mobembo.DomainServices.Interfaces.Admin;

import java.util.List;

import com.mobembo.mobembo.DomainServices.Model.Request.Admin.TravelRequest;
import com.mobembo.mobembo.DomainServices.Model.Response.Admin.TravelResponse;

import org.springframework.http.ResponseEntity;

public interface TravelInterface {
    
    ResponseEntity<TravelRequest> Create(TravelRequest viagemRequest);
    ResponseEntity<TravelResponse> Update(TravelResponse viagemRequest);
    ResponseEntity<TravelRequest> Delete(String idViagem);
    ResponseEntity<TravelRequest> GetById(String idViagem);
    ResponseEntity<List<TravelResponse>> GetAllAtivo();
    ResponseEntity<List<TravelResponse>> GetAll();
    ResponseEntity<List<TravelResponse>> UpdateAll();
    ResponseEntity<List<TravelResponse>> GetAllByIdAdmin(String idAdmin);
}

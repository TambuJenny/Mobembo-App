package com.mobembo.mobembo.DomainServices.Interfaces.User;

import java.util.List;

import com.mobembo.mobembo.DomainServices.Model.PersonModel;
import com.mobembo.mobembo.DomainServices.Model.PDO.User.UserDriverDTO;

import org.springframework.http.ResponseEntity;

public interface UserDriverInterface {
    
    ResponseEntity<PersonModel> Create(UserDriverDTO personModel);
    ResponseEntity<PersonModel> Update(UserDriverDTO personModel);
    ResponseEntity<PersonModel> Delete(String idPerson);
    ResponseEntity<PersonModel> GetById(String idPerson);
    ResponseEntity<List<PersonModel>> GetAll();
}

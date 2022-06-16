package com.mobembo.mobembo.Interfaces.User;

import java.util.List;

import com.mobembo.mobembo.Model.PersonModel;

import org.springframework.http.ResponseEntity;

public interface UserDriverInterface {
    
    ResponseEntity<PersonModel> Create(PersonModel PersonModel);
    ResponseEntity<PersonModel> Update(PersonModel PersonModel);
    ResponseEntity<PersonModel> Delete(String idPerson);
    ResponseEntity<PersonModel> GetById(String idPerson);
    ResponseEntity<List<PersonModel>> GetAll();
}

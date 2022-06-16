package com.mobembo.mobembo.Interfaces.User;

import java.util.List;

import com.mobembo.mobembo.Model.PersonModel;

import org.springframework.http.ResponseEntity;

public interface UserClientInterface  {
    
    ResponseEntity<PersonModel> Create(PersonModel personModel);
    ResponseEntity<PersonModel> Update(PersonModel personModel);
    ResponseEntity<PersonModel> Delete(String idPerson);
    ResponseEntity<PersonModel> GetById(String idPerson);
    ResponseEntity<List<PersonModel>> GetAll();

}

package com.mobembo.mobembo.DomainServices.Interfaces.User;

import java.util.List;

import com.mobembo.mobembo.DomainServices.Model.PDO.User.MaterialGoodDTO;
import com.mobembo.mobembo.DomainServices.Model.User.MaterialGoodModel;

import org.springframework.http.ResponseEntity;

public interface MaterialGoodInterface {

    ResponseEntity<MaterialGoodModel> Create(MaterialGoodDTO personModel);
    ResponseEntity<MaterialGoodModel> Update(MaterialGoodDTO personModel);
    ResponseEntity<MaterialGoodModel> Delete(String idPerson);
    ResponseEntity<MaterialGoodModel> GetById(String idPerson);
    ResponseEntity<List<MaterialGoodModel>> GetAll();
}

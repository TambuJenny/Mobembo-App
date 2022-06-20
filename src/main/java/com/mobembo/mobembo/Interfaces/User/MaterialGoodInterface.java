package com.mobembo.mobembo.Interfaces.User;

import java.util.List;

import com.mobembo.mobembo.Model.PDO.User.MaterialGoodDTO;
import com.mobembo.mobembo.Model.User.MaterialGoodModel;

import org.springframework.http.ResponseEntity;

public interface MaterialGoodInterface {

    ResponseEntity<MaterialGoodModel> Create(MaterialGoodDTO personModel);
    ResponseEntity<MaterialGoodModel> Update(MaterialGoodDTO personModel);
    ResponseEntity<MaterialGoodModel> Delete(String idPerson);
    ResponseEntity<MaterialGoodModel> GetById(String idPerson);
    ResponseEntity<List<MaterialGoodModel>> GetAll();
}

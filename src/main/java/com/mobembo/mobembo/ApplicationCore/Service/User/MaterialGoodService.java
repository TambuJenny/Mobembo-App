package com.mobembo.mobembo.ApplicationCore.Service.User;

import java.util.List;

import com.mobembo.mobembo.Infrastruture.Repository.MaterialGoodRepository;
import com.mobembo.mobembo.Infrastruture.Repository.UserClientRepository;
import com.mobembo.mobembo.DomainServices.Interfaces.User.MaterialGoodInterface;
import com.mobembo.mobembo.DomainServices.Model.PDO.User.MaterialGoodDTO;
import com.mobembo.mobembo.DomainServices.Model.User.MaterialGoodModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MaterialGoodService implements MaterialGoodInterface {

    @Autowired
    private MaterialGoodRepository  _materialGoodRepository ;

    @Autowired
    private UserClientRepository _userClientRepository;

    @Override
    public ResponseEntity<MaterialGoodModel> Create(MaterialGoodDTO personModel) {
         


        return null;
    }

    @Override
    public ResponseEntity<MaterialGoodModel> Update(MaterialGoodDTO personModel) {
       
        return null;
    }

    @Override
    public ResponseEntity<MaterialGoodModel> Delete(String idPerson) {
       
        return null;
    }

    @Override
    public ResponseEntity<MaterialGoodModel> GetById(String idPerson) {
        
        return null;
    }

    @Override
    public ResponseEntity<List<MaterialGoodModel>> GetAll() {
       
        return null;
    }
    
}

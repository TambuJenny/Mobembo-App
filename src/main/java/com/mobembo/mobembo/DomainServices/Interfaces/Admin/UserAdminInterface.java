package com.mobembo.mobembo.DomainServices.Interfaces.Admin;

import java.util.List;

import com.mobembo.mobembo.DomainServices.Model.PDO.Admin.UserAdminDTO;

import org.springframework.http.ResponseEntity;

public interface UserAdminInterface {
    
    ResponseEntity<UserAdminDTO> Create(UserAdminDTO personModel);
    ResponseEntity<UserAdminDTO> Update(UserAdminDTO personModel);
    ResponseEntity<UserAdminDTO> Delete(String idPerson);
    ResponseEntity<UserAdminDTO> GetById(String idPerson);
    ResponseEntity<List<UserAdminDTO>> GetAll();
}

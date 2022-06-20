package com.mobembo.mobembo.Interfaces.Admin;

import java.util.List;

import com.mobembo.mobembo.Model.PDO.Admin.UserAdminDTO;

import org.springframework.http.ResponseEntity;

public interface UserAdminInterface {
    
    ResponseEntity<UserAdminDTO> Create(UserAdminDTO personModel);
    ResponseEntity<UserAdminDTO> Update(UserAdminDTO personModel);
    ResponseEntity<UserAdminDTO> Delete(String idPerson);
    ResponseEntity<UserAdminDTO> GetById(String idPerson);
    ResponseEntity<List<UserAdminDTO>> GetAll();
}

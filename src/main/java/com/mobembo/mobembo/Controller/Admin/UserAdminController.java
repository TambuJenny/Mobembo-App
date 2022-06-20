package com.mobembo.mobembo.Controller.Admin;

import com.mobembo.mobembo.Model.PersonModel;
import com.mobembo.mobembo.Model.PDO.Admin.UserAdminDTO;
import com.mobembo.mobembo.Service.Admin.UserAdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/useradmin")
public class UserAdminController {
    
    @Autowired
    private UserAdminService _userAdminService;

    @PostMapping
    public ResponseEntity<UserAdminDTO> Create( @RequestBody UserAdminDTO adminRequest) {

        return  _userAdminService.Create(adminRequest);
    }

    @PutMapping
    public ResponseEntity<UserAdminDTO> update( @RequestBody PersonModel personModel) {
       
       return null;
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<UserAdminDTO> Delete(@PathVariable String id) {
    
        return  _userAdminService.Delete(id);
   }

   @GetMapping("/{id}")
   public ResponseEntity<UserAdminDTO> GetById(@PathVariable String id) {
        return _userAdminService.GetById(id);
   }

  /* @GetMapping("/getall")
   public ResponseEntity<List<PersonModel>> GetAll() {
        return _UserClientService.GetAll();
   }*/

}

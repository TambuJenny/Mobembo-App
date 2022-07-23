package com.mobembo.mobembo.UI.Controller.User;

import java.util.List;

import com.mobembo.mobembo.ApplicationCore.Service.User.UserClientService;
import com.mobembo.mobembo.DomainServices.Model.PersonModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/UserClient")
@CrossOrigin(origins = "http://localhost:9191")
public class UserClientController {

    @Autowired
    private UserClientService _UserClientService;

    @CrossOrigin(origins = "*")
    @PostMapping
    public PersonModel Create( @RequestBody PersonModel personModel) {
         _UserClientService.Create(personModel);
        return personModel;
    }

    @PutMapping
    public PersonModel update( @RequestBody PersonModel personModel) {
        _UserClientService.Update(personModel);
       return personModel;
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<PersonModel> Delete(@PathVariable String id) {
       return _UserClientService.Delete(id);
   }

   @GetMapping("/{id}")
   public ResponseEntity<PersonModel> GetById(@PathVariable String id) {
        return _UserClientService.GetById(id);
   }

   @GetMapping("/getall")
   public ResponseEntity<List<PersonModel>> GetAll() {
        return _UserClientService.GetAll();
   }

}

package com.mobembo.mobembo.Controller.User;

import com.mobembo.mobembo.Model.PDO.User.TravelUserDTO;
import com.mobembo.mobembo.Model.Response.User.TravelPlaceResponse;
import com.mobembo.mobembo.Model.Response.User.TravelUsersResponse;
import com.mobembo.mobembo.Service.User.TravelUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/travelUser")
@CrossOrigin(origins = "*")
public class TravelUserController {
    
    @Autowired
    private TravelUserService _travelUserService;
 
    @PostMapping
    public ResponseEntity<TravelUserDTO> Create( @RequestBody TravelUserDTO travelUser) {

        return  _travelUserService.Create(travelUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TravelPlaceResponse>Getplace(@PathVariable String id) {

        return  _travelUserService.Getplace(id);
    }

    @GetMapping("/travelInfoUser/{codigoViagem}")
    public ResponseEntity<TravelUsersResponse>GetTravelUser(@PathVariable String codigoViagem) {

        return  _travelUserService.GetTravelUser(codigoViagem);
    }
}

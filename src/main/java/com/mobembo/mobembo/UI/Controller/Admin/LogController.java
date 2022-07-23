package com.mobembo.mobembo.UI.Controller.Admin;

import com.mobembo.mobembo.ApplicationCore.Service.Admin.LogService;
import com.mobembo.mobembo.DomainServices.Model.Request.Admin.LoginRequest;
import com.mobembo.mobembo.DomainServices.Model.Response.Admin.LoginResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/login")
@CrossOrigin(origins = "*")
public class LogController {

    @Autowired
    private LogService _loginService;

    @PostMapping
    public ResponseEntity<LoginResponse> Login(@RequestBody LoginRequest loginRequest) {

         return _loginService.Login(loginRequest);
    }

}

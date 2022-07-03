package com.mobembo.mobembo.Interfaces.Admin;

import com.mobembo.mobembo.Model.Response.Admin.LoginResponse;

import org.springframework.http.ResponseEntity;

public interface LoginInterface {
    
    ResponseEntity<LoginResponse> Login(LoginResponse loginRequest);
    ResponseEntity<LoginResponse> Logoff(LoginResponse loginRequest);

}

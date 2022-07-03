package com.mobembo.mobembo.Service.Admin;

import com.mobembo.mobembo.Interfaces.Admin.LoginInterface;
import com.mobembo.mobembo.Model.Response.Admin.LoginResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginInterface {

    
    @Override
    public ResponseEntity<LoginResponse> Login(LoginResponse loginRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<LoginResponse> Logoff(LoginResponse loginRequest) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

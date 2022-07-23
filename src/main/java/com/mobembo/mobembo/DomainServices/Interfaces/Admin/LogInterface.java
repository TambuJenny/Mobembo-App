package com.mobembo.mobembo.DomainServices.Interfaces.Admin;

import com.mobembo.mobembo.DomainServices.Model.Request.Admin.LoginRequest;
import com.mobembo.mobembo.DomainServices.Model.Request.Admin.LogoffRequest;
import com.mobembo.mobembo.DomainServices.Model.Response.Admin.LoginResponse;

import org.springframework.http.ResponseEntity;

public interface LogInterface {
    
    ResponseEntity<LoginResponse> Login(LoginRequest loginRequest);
    ResponseEntity<LoginResponse> Logoff(LogoffRequest logoffRequest);

}

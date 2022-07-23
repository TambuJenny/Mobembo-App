package com.mobembo.mobembo.ApplicationCore.Service.Admin;

import com.mobembo.mobembo.Infrastruture.Repository.PersonRepository;
import com.mobembo.mobembo.Infrastruture.Repository.Admin.UserAdminRepository;
import com.mobembo.mobembo.DomainServices.Interfaces.Admin.LogInterface;
import com.mobembo.mobembo.DomainServices.Model.PersonModel;
import com.mobembo.mobembo.DomainServices.Model.Admin.UserAdminModel;
import com.mobembo.mobembo.DomainServices.Model.Enum.LoginEnum;
import com.mobembo.mobembo.DomainServices.Model.Request.Admin.LoginRequest;
import com.mobembo.mobembo.DomainServices.Model.Request.Admin.LogoffRequest;
import com.mobembo.mobembo.DomainServices.Model.Response.Admin.LoginResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LogService implements LogInterface {

    @Autowired
    private UserAdminRepository _userAdminRepository;

    @Autowired
    private PersonRepository  _userRepository;

    @Override
    public ResponseEntity<LoginResponse> Login(LoginRequest loginRequest) {
        
        boolean verification = VerificationEmailPassword(loginRequest.getEmail(), loginRequest.getSenha());

        if(!verification)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"E-mail ou Senha inválido");
        
        return ResponseEntity.ok().body(RetornarDados(loginRequest.getEmail(), loginRequest.getSenha()));
    }

    private boolean VerificationEmailPassword(String email, String senha)
    {
        boolean verification = false;
        var pegarTodasPessoas = _userRepository.findAll();
        var pegarTodosAdmins = _userAdminRepository.findAll();

        for (PersonModel personModel : pegarTodasPessoas) {

                if (personModel.getEmail().equals(email))
                {
                    for (UserAdminModel userAdminModel : pegarTodosAdmins) {
                        
                        if(userAdminModel.getSenha().equals(senha))
                            return verification = true;
                    }
                }            
        }

        return verification;
    }

    private LoginResponse RetornarDados(String email, String senha)
    {
        LoginResponse dadosAdmin = new LoginResponse();
        var pegarTodasPessoas = _userRepository.findAll();
        var pegarTodosAdmins = _userAdminRepository.findAll();

        for (PersonModel personModel : pegarTodasPessoas) {

                if (personModel.getEmail().equals(email))
                {
                    dadosAdmin.setEmail(personModel.getEmail());
                    dadosAdmin.setEstado(LoginEnum.Online);
                    dadosAdmin.setNome(personModel.getPrimeiroNome() +" "+ personModel.getUltimoNome() );
                    
                    for (UserAdminModel userAdminModel : pegarTodosAdmins) {
                        
                        if(userAdminModel.getSenha().equals(senha))
                            dadosAdmin.setIdUserAdmin(userAdminModel.getId());
                    }
                    
                }            
        }

        return dadosAdmin;
    }

    @Override
    public ResponseEntity<LoginResponse> Logoff(LogoffRequest logoffRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    
}

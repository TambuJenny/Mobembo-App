/*package com.mobembo.mobembo.service.User;

import java.util.List;

import com.mobembo.mobembo.Generique.GeneriqueClasse;
import com.mobembo.mobembo.Interfaces.User.UserDriverInterface;
import com.mobembo.mobembo.Model.PersonModel;
import com.mobembo.mobembo.Model.User.ClientModel;
import com.mobembo.mobembo.Model.User.DriverModel;
import com.mobembo.mobembo.Repository.PersonRepository;
import com.mobembo.mobembo.Repository.UserClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

public class UserDriverService implements UserDriverInterface {

    @Autowired
    private PersonRepository _personRepository;

    @Autowired
    private UserClientRepository _userClientRepository;

    private GeneriqueClasse _generiqueClasse = new GeneriqueClasse();

    @Override
    public ResponseEntity<PersonModel> Create(PersonModel personModel) {
        
        boolean verficarSePessoaExiste = false,verificarSeBIExiste = false;
        var pegarTodasPessoas = _personRepository.findAll();
 
        for (PersonModel result : pegarTodasPessoas) {
 
            if(result.getBI().equals(personModel.getBI()) )
                 verificarSeBIExiste = true;
                
        }
 
         if(personModel != null)
             verficarSePessoaExiste = _personRepository.existsById(personModel.getId());
         
         if(verficarSePessoaExiste || verificarSeBIExiste)
             throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Erro-UserClient-Motorista Existe");
 
         personModel.setId(_generiqueClasse.GerarID());
         personModel.setCreateDate(_generiqueClasse.PegarDataAtual());
         personModel.setUpdateDate(_generiqueClasse.PegarDataAtual());
         _personRepository.save(personModel);
 
         var pegarClient = _personRepository.getReferenceById(personModel.getId());
 
         if(pegarClient != null )
         {
             var userClient = new DriverModel();
             userClient.setId(_generiqueClasse.GerarID());
             userClient.setPessoa(pegarClient);
 
             _userClientRepository.save(userClient);
         }
     
         return ResponseEntity.ok().body(personModel);
    }

    @Override
    public ResponseEntity<PersonModel> Update(PersonModel personModel) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<PersonModel> Delete(String idPerson) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<PersonModel> GetById(String idPerson) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<List<PersonModel>> GetAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}*/

/*package com.mobembo.mobembo.Service.User;

import java.util.List;

import com.mobembo.mobembo.Generique.GeneriqueClasse;
import com.mobembo.mobembo.Interfaces.User.UserDriverInterface;
import com.mobembo.mobembo.Model.PersonModel;
import com.mobembo.mobembo.Model.PDO.User.UserDriverDTO;
import com.mobembo.mobembo.Model.User.ClientModel;
import com.mobembo.mobembo.Model.User.DriverModel;
import com.mobembo.mobembo.Repository.PersonRepository;
import com.mobembo.mobembo.Repository.UserClientRepository;
import com.mobembo.mobembo.Repository.UserDriverRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

public class UserDriverService implements UserDriverInterface {

    @Autowired
    private PersonRepository _personRepository;
    @Autowired
    private UserDriverRepository _userDriveRepository;

    private GeneriqueClasse _generiqueClasse = new GeneriqueClasse();

    @Override
    public ResponseEntity<PersonModel> Create(UserDriverDTO personModel) {
        boolean verficarSePessoaExiste = false,verificarSeBIExiste = false;

        PersonModel pessoaModel = new PersonModel();

        var pegarTodasPessoas = _personRepository.findAll();
 
        for (PersonModel result : pegarTodasPessoas) {
 
            if(result.getBI().equals(personModel.getBI()) )
                 verificarSeBIExiste = true;       
        }
 
         if(personModel != null)
             if(verficarSePessoaExiste || verificarSeBIExiste)
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Erro-UserClient-Client Existe");
        
         pessoaModel.setBI(personModel.getBI());
         pessoaModel.setEmail(personModel.getEmail());
         pessoaModel.setGenero(personModel.getGenero());
         pessoaModel.setMorada(personModel.getMorada());
         pessoaModel.setTelefone(personModel.getTelefone());
         pessoaModel.setPrimeiroNome(personModel.getPrimeiroNome());
         pessoaModel.setUltimoNome(personModel.getUltimoNome());
         pessoaModel.setId(_generiqueClasse.GerarID());
         pessoaModel.setCreateDate(_generiqueClasse.PegarDataAtual());
         pessoaModel.setUpdateDate(_generiqueClasse.PegarDataAtual());

         pessoaModel.setCreateDate(_generiqueClasse.PegarDataAtual());
         pessoaModel.setUpdateDate(_generiqueClasse.PegarDataAtual());
         _personRepository.save(pessoaModel);
 
         var pegarClient = _personRepository.getReferenceById(pessoaModel.getId());
 
        if(pegarClient != null )
         {
             var userDriver = new DriverModel();
             userDriver.setId(_generiqueClasse.GerarID());
             userDriver.setPessoa(pegarClient);
             userDriver.setSenha(personModel.getSenha());
             userDriver.setActiveAccount(personModel.isContaAtivo());

             _userDriveRepository.save(userDriver);
         }
     
        return ResponseEntity.ok().body(pessoaModel);
    }

    @Override
    public ResponseEntity<PersonModel> Update(UserDriverDTO PersonModel) {
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

package com.mobembo.mobembo.ApplicationCore.Service.User;

import java.util.ArrayList;
import java.util.List;

import com.mobembo.mobembo.Infrastruture.Repository.PersonRepository;
import com.mobembo.mobembo.Infrastruture.Repository.UserClientRepository;
import com.mobembo.mobembo.ApplicationCore.Generique.GeneriqueClasse;
import com.mobembo.mobembo.DomainServices.Interfaces.User.UserClientInterface;
import com.mobembo.mobembo.DomainServices.Model.PersonModel;
import com.mobembo.mobembo.DomainServices.Model.User.ClientModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class UserClientService implements UserClientInterface {

    @Autowired
    private PersonRepository _personRepository;

    @Autowired
    private UserClientRepository _userClientRepository;

    private GeneriqueClasse _generiqueClasse = new GeneriqueClasse();

    public UserClientService()
    {
      
    }

    @Override
    public ResponseEntity<PersonModel> Create(PersonModel personModel)
     {

       boolean verficarSePessoaExiste = false,verificarSeBIExiste = false;
       var pegarTodasPessoas = _personRepository.findAll();

       for (PersonModel result : pegarTodasPessoas) {

           if(result.getBI().equals(personModel.getBI()) )
                verificarSeBIExiste = true;
               
       }

        if(personModel != null)
            verficarSePessoaExiste = _personRepository.existsById(personModel.getId());
        
        if(verficarSePessoaExiste || verificarSeBIExiste)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Erro-UserClient-Client Existe");

        personModel.setId(_generiqueClasse.GerarID());
        personModel.setCreateDate(_generiqueClasse.PegarDataAtual());
        personModel.setUpdateDate(_generiqueClasse.PegarDataAtual());
        _personRepository.save(personModel);

        var pegarClient = _personRepository.getReferenceById(personModel.getId());

        if(pegarClient != null )
        {
            var userClient = new ClientModel();
            userClient.setId(_generiqueClasse.GerarID());
            userClient.setPessoa(pegarClient);

            _userClientRepository.save(userClient);
        }
    
        return ResponseEntity.ok().body(personModel);
    }

    @Override
    public ResponseEntity<PersonModel> Update(PersonModel personModel) {
        
        PersonModel existingProduct = _personRepository.findById(personModel.getId()).orElse(null);

        if(existingProduct != null)
        {
            existingProduct.setBI(personModel.getBI());
            existingProduct.setEmail(personModel.getEmail());
            existingProduct.setGenero(personModel.getGenero());
            existingProduct.setMorada(personModel.getMorada());
            existingProduct.setPrimeiroNome(personModel.getPrimeiroNome());
            existingProduct.setUltimoNome(personModel.getUltimoNome());
            existingProduct.setTelefone(personModel.getTelefone());
            existingProduct.setUpdateDate(_generiqueClasse.PegarDataAtual());
            _personRepository.save(existingProduct);
        }
        else 
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Erro-UserClient-Client não Existe");

        return ResponseEntity.ok().body(personModel);
    }

    @Override
    public ResponseEntity<PersonModel> Delete(String idPerson) {

        PersonModel existePessoa = _personRepository.findById(idPerson).orElse(null);
        List<ClientModel> existeCliente = _userClientRepository.findAll();
        
        if(existePessoa.equals(null) )
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Erro-UserClient-Client não Existe");
        _personRepository.delete(existePessoa);

        for (ClientModel clientModel : existeCliente) {
            if(clientModel.getPerson().getId().equals(idPerson))
                _userClientRepository.delete(clientModel); 
        }

        return ResponseEntity.ok().body(existePessoa);
    }

    @Override
    public ResponseEntity<PersonModel> GetById(String idPerson) {

        PersonModel existePessoa = new PersonModel ();
        existePessoa = _personRepository.findById(idPerson).orElse(null);

        if(existePessoa.equals(null) )
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Erro-UserClient Client não Existe");

        return ResponseEntity.ok().body(existePessoa);
    }

    @Override
    public ResponseEntity<List<PersonModel>> GetAll() 
    {
       List<ClientModel> pegaTodosCliente = new ArrayList<ClientModel>() ;
       pegaTodosCliente = _userClientRepository.findAll();
       List<PersonModel> pegarTodospersonCliente = new ArrayList<PersonModel>() ;

       for (ClientModel clientModel : pegaTodosCliente) {
        PersonModel pegarPessoa = new PersonModel ();
        pegarPessoa = _personRepository.findById(clientModel.getPerson().getId()).orElse(null);
        
           if(pegarPessoa != null)
           {
                pegarTodospersonCliente.add(pegarPessoa);
           }
       }
    
        return ResponseEntity.ok().body(pegarTodospersonCliente);
    }
}

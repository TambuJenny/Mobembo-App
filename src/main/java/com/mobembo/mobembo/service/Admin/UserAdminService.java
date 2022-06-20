package com.mobembo.mobembo.Service.Admin;

import java.util.List;

import com.mobembo.mobembo.Generique.GeneriqueClasse;
import com.mobembo.mobembo.Interfaces.Admin.UserAdminInterface;
import com.mobembo.mobembo.Model.PersonModel;
import com.mobembo.mobembo.Model.Admin.UserAdminModel;
import com.mobembo.mobembo.Model.Enum.SessionEnum;
import com.mobembo.mobembo.Model.PDO.Admin.UserAdminDTO;
import com.mobembo.mobembo.Repository.PersonRepository;
import com.mobembo.mobembo.Repository.Admin.UserAdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserAdminService implements UserAdminInterface {
    
    @Autowired
    private PersonRepository _personRepository;

    @Autowired
    private UserAdminRepository _userAdminRepository;

    private GeneriqueClasse _generiqueClasse = new GeneriqueClasse();

    @Override
    public ResponseEntity<UserAdminDTO> Create(UserAdminDTO userAdmin) {

        List<PersonModel> pegarTodasPessoas = _personRepository.findAll();
        List<UserAdminModel> pegarTodosAdmin = _userAdminRepository.findAll();
        UserAdminModel adminModel = new UserAdminModel();

        String pegarIdPessoa = "";
        boolean verficarSePessoaExiste = false;
        var pegarPessoa = new PersonModel();

        for (PersonModel userAdmin2 : pegarTodasPessoas) {

                if(userAdmin2.getBI().equals(userAdmin.getBI()) && userAdmin.getEmail().equals(userAdmin2.getEmail()))
                {
                    verficarSePessoaExiste = true;
                    pegarIdPessoa = userAdmin2.getId();
                }
                    
        }

        if(verficarSePessoaExiste)
        {
            for (UserAdminModel userAdminModel : pegarTodosAdmin) {
                
                if(userAdminModel.getPessoa().getId().equals(pegarIdPessoa))
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Erro-UserAdmin-Admin Existe");
  
            }

                pegarPessoa = _personRepository.getReferenceById(pegarIdPessoa);
                
                adminModel.setId(_generiqueClasse.GerarID());
                adminModel.setSenha(userAdmin.getSenha());
                adminModel.setEstadoSessão(SessionEnum.Ativo);
                adminModel.setPessoa(pegarPessoa);

                _userAdminRepository.save(adminModel);

        } else
        {
                pegarPessoa.setBI(userAdmin.getBI());
                pegarPessoa.setEmail(userAdmin.getEmail());
                pegarPessoa.setGenero(userAdmin.getGenero());
                pegarPessoa.setId(_generiqueClasse.GerarID());
                pegarPessoa.setMorada(userAdmin.getMorada());
                pegarPessoa.setPrimeiroNome(userAdmin.getPrimeiroNome());
                pegarPessoa.setTelefone(userAdmin.getTelefone());
                pegarPessoa.setUltimoNome(userAdmin.getUltimoNome());

                pegarPessoa.setCreateDate(_generiqueClasse.PegarDataAtual());
                pegarPessoa.setUpdateDate(_generiqueClasse.PegarDataAtual());

                var pegarDadosSalvo = _personRepository.save(pegarPessoa);
                
                if(pegarDadosSalvo!= null)
                {
                    pegarPessoa = _personRepository.getReferenceById(pegarDadosSalvo.getId());
                
                    adminModel.setId(_generiqueClasse.GerarID());
                    adminModel.setSenha(userAdmin.getSenha());
                    adminModel.setEstadoSessão(SessionEnum.Ativo);
                    adminModel.setPessoa(pegarPessoa);
    
                    _userAdminRepository.save(adminModel);
                }

        }

        return ResponseEntity.ok().body(null);
    }

    @Override
    public ResponseEntity<UserAdminDTO> Update(UserAdminDTO userAdmin) {
        return null;
    }

    @Override
    public ResponseEntity<UserAdminDTO> Delete(String idAdmin) 
    {
        var pegarAdminById = _userAdminRepository.getReferenceById(idAdmin);

        if(pegarAdminById == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Erro-UserAdmin-Admin não existe");
        
        _userAdminRepository.delete(pegarAdminById);

        return ResponseEntity.ok().body(null);
    }

    @Override
    public ResponseEntity<UserAdminDTO> GetById(String idPerson) {
        return null;
    }

    @Override
    public ResponseEntity<List<UserAdminDTO>> GetAll() {
        return null;
    }
    
}

package com.mobembo.mobembo.ApplicationCore.Service.User;

import com.mobembo.mobembo.Infrastruture.Repository.PersonRepository;
import com.mobembo.mobembo.Infrastruture.Repository.TravelUserRepository;
import com.mobembo.mobembo.Infrastruture.Repository.UserClientRepository;
import com.mobembo.mobembo.Infrastruture.Repository.Admin.TravelRepository;
import com.mobembo.mobembo.ApplicationCore.Generique.GeneriqueClasse;
import com.mobembo.mobembo.DomainServices.Interfaces.User.TravelUserInterface;
import com.mobembo.mobembo.DomainServices.Model.Admin.TravelModel;
import com.mobembo.mobembo.DomainServices.Model.PDO.User.TravelUserDTO;
import com.mobembo.mobembo.DomainServices.Model.Response.User.TravelPlaceResponse;
import com.mobembo.mobembo.DomainServices.Model.Response.User.TravelUsersResponse;
import com.mobembo.mobembo.DomainServices.Model.User.ClientModel;
import com.mobembo.mobembo.DomainServices.Model.User.TravelUserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TravelUserService implements TravelUserInterface {

    @Autowired
    private TravelUserRepository _travelUserRepository;

    @Autowired
    private TravelRepository _travelRepository;

    @Autowired
    private UserClientRepository  _userClientRepository;

    @Autowired
    private PersonRepository  _userRepository;
    

    private GeneriqueClasse _generiqueClasse = new GeneriqueClasse();

    @Override
    public ResponseEntity<TravelUserDTO> Create(TravelUserDTO travelUser) {

        TravelUserModel  travelUserModel = new TravelUserModel();
        
        TravelModel travel = new TravelModel (); 
        travel = _travelRepository.findById(travelUser.getTravelId()).orElse(null);

        ClientModel  userclient = new ClientModel();

        var pegarTodosClient = _userClientRepository.findAll();

        for (ClientModel clientModel : pegarTodosClient) {
            
            if(clientModel.getPessoa().getId().equals(travelUser.getUserClientId()))
                userclient = clientModel;
        }
        

        travelUserModel.setId(_generiqueClasse.GerarID());
        travelUserModel.setTravel(travel);
        travelUserModel.setUserClient(userclient);
        travelUserModel.setEstadoViagem(travelUser.getEstadoViagem());
        travelUserModel.setCodigoViagem(_generiqueClasse.GerarCodigoViagem());
        travelUserModel.setCreateDate(_generiqueClasse.PegarDataAtual());
        travelUserModel.setUpdateDate(_generiqueClasse.PegarDataAtual());

        var viagemRetorno = _travelUserRepository.save(travelUserModel);

        var getViagem = _travelRepository.getReferenceById(viagemRetorno.getTravel().getId());
        int lugar = getViagem.getLugar();
        getViagem.setLugar(lugar - 1);

        _travelRepository.save(getViagem);

        return ResponseEntity.ok().body(null);
    }

    @Override
    public ResponseEntity<TravelUserDTO> Update(String codigoViagem) {
        return null;
    }

    @Override
    public ResponseEntity<TravelPlaceResponse> Getplace(String codigoViagem) {

        TravelPlaceResponse lugar = new TravelPlaceResponse();
        var getViagem = _travelRepository.getReferenceById(codigoViagem);

        lugar.setIdViagem(getViagem.getId());
        lugar.setLugar(getViagem.getLugar());

        return ResponseEntity.ok().body(lugar);
    }

    @Override
    public ResponseEntity<TravelUsersResponse> GetTravelUser(String codigoViagem) {
        
        var pegarTodasViagem = _travelUserRepository.findAll();
        TravelUserModel travelUser = new TravelUserModel ();

        for (TravelUserModel travelUserModel : pegarTodasViagem) {
           
            if (travelUserModel.getCodigoViagem().equals(codigoViagem)) 
                travelUser = travelUserModel;
        }

        if(travelUser.equals(null))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Erro-UserClient Client não Existe");
        
        var pegarInformacaoViagem = _travelRepository.findById(travelUser.getTravel().getId()).orElse(null);
        var pegarIdPessoa = _userClientRepository.findById(travelUser.getUserClient().getId()).orElse(null).getPerson().getId();
        var pegarInformacaoPessoa =  _userRepository.findById(pegarIdPessoa).orElse(null);

        var responseDados = new TravelUsersResponse ();
        responseDados.setAno(pegarInformacaoViagem.getAno());
        responseDados.setDestino(pegarInformacaoViagem.getDestino());
        responseDados.setOrigim(pegarInformacaoViagem.getOrigin());
        responseDados.setDiaSemana(pegarInformacaoViagem.getDiaSemana());
        //responseDados.setEmail(pegarInformacaoViagem.g);
        responseDados.setEstadoViagem(travelUser.getEstadoViagem());
        responseDados.setMes(pegarInformacaoViagem.getMes());
        responseDados.setDia(pegarInformacaoViagem.getDia());
        responseDados.setPreco(pegarInformacaoViagem.getPrecoNormal());
        responseDados.setHoraPartida(pegarInformacaoViagem.getHoraPartida());

        responseDados.setPNome(pegarInformacaoPessoa.getPrimeiroNome());
        responseDados.setUNome(pegarInformacaoPessoa.getUltimoNome());
        responseDados.setTelefone(pegarInformacaoPessoa.getTelefone());

        return ResponseEntity.ok().body(responseDados);
    }

}

package com.mobembo.mobembo.ApplicationCore.Service.Admin;

import java.util.ArrayList;
import java.util.List;

import com.mobembo.mobembo.Infrastruture.Repository.TravelUserRepository;
import com.mobembo.mobembo.Infrastruture.Repository.Admin.TravelRepository;
import com.mobembo.mobembo.Infrastruture.Repository.Admin.UserAdminRepository;
import com.mobembo.mobembo.ApplicationCore.Generique.GeneriqueClasse;
import com.mobembo.mobembo.ApplicationCore.Generique.Mapping;
import com.mobembo.mobembo.DomainServices.Interfaces.Admin.TravelInterface;
import com.mobembo.mobembo.DomainServices.Model.Admin.TravelModel;
import com.mobembo.mobembo.DomainServices.Model.Enum.StateTravelEnum;
import com.mobembo.mobembo.DomainServices.Model.Request.Admin.TravelRequest;
import com.mobembo.mobembo.DomainServices.Model.Response.Admin.TravelResponse;
import com.mobembo.mobembo.DomainServices.Model.User.TravelUserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TravelService implements TravelInterface {

    @Autowired
    private TravelRepository _travelRepository;

    @Autowired
    private UserAdminRepository _userAdminRepository;

    @Autowired
    private TravelUserRepository _travelUserAdminRepository;

    private GeneriqueClasse _generiqueClasse = new GeneriqueClasse();
    private Mapping _mapping = new Mapping();

    @Override
    public ResponseEntity<TravelRequest> Create(TravelRequest viagemRequest) {
        var pegarTodasViagems = _travelRepository.findAll();

        /*
         * for (TravelModel travelModel : pegarTodasViagems) {
         * 
         * if (travelModel.getAno() == viagemRequest.getAno() &&
         * travelModel.getMes().equals(viagemRequest.getMes()) && travelModel.getDia()
         * == viagemRequest.getDia() &&
         * travelModel.getDiaSemana().equals(viagemRequest.getDiaSemana()) &&
         * travelModel.getHoraPartida().equals(viagemRequest.getHoraPartida()))
         * throw new
         * ResponseStatusException(HttpStatus.BAD_REQUEST,"Erro-Travel-Viagem já existe"
         * );
         * 
         * }
         */

        TravelModel travel = new TravelModel();
        var admin = _userAdminRepository.getReferenceById(viagemRequest.getIdAdmin());

        travel.setId(_generiqueClasse.GerarID());
        travel.setAno(viagemRequest.getAno());
        travel.setDia(viagemRequest.getDia());
        travel.setDiaSemana(viagemRequest.getDiaSemana());
        travel.setMes(viagemRequest.getMes());
        travel.setOrigin(viagemRequest.getOrigin());
        travel.setDestino(viagemRequest.getDestino());
        travel.setEstadoViagem(viagemRequest.getEstadoViagem());
        travel.setPrecoNormal(viagemRequest.getPrecoNormal());
        travel.setHoraPartida(viagemRequest.getHoraPartida());
        travel.setPrecoVip(viagemRequest.getPrecoVip());
        travel.setAdmin(admin);
        travel.setLugar(viagemRequest.getLugar());

        travel.setUpdateDate(_generiqueClasse.PegarDataAtual());
        travel.setCreateDate(_generiqueClasse.PegarDataAtual());

        _travelRepository.save(travel);
        return ResponseEntity.ok().body(null);
    }

    @Override
    public ResponseEntity<TravelResponse> Update(TravelResponse viagemResponse) {

        if (!_travelRepository.existsById(viagemResponse.getId()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Erro-Travel-Viagem não existe");

        _travelRepository.save(_mapping.ConverterparaTravelModel(viagemResponse));

        return ResponseEntity.ok().body(null);
    }

    @Override
    public ResponseEntity<TravelRequest> Delete(String idViagem) {

        if (!_travelRepository.existsById(idViagem))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Erro-Travel-Viagem não existe");

        var pegarViagem = _travelRepository.findById(idViagem).orElse(null);

        var getViagemUsario = _travelUserAdminRepository.findAll();
        if(getViagemUsario.size() != 0)
        {
            for (TravelUserModel travelUserModel : getViagemUsario) {

                if (travelUserModel.getTravel().getId().equals(idViagem)) {
                    _travelUserAdminRepository.delete(travelUserModel);
                }
            }
        }
        
        _travelRepository.delete(pegarViagem);
        return ResponseEntity.ok().body(null);
    }

    @Override
    public ResponseEntity<TravelRequest> GetById(String idViagem) {
        var pegarViagem = _travelRepository.getReferenceById(idViagem);
        TravelRequest travel = new TravelRequest();

        travel.setAno(pegarViagem.getAno());
        travel.setDestino(pegarViagem.getDestino());
        travel.setDia(pegarViagem.getDia());
        travel.setDiaSemana(pegarViagem.getDiaSemana());
        travel.setEstadoViagem(pegarViagem.getEstadoViagem());
        travel.setHoraPartida(pegarViagem.getHoraPartida());
        travel.setMes(pegarViagem.getMes());
        travel.setOrigin(pegarViagem.getOrigin());
        travel.setPrecoNormal(pegarViagem.getPrecoNormal());
        travel.setPrecoVip(pegarViagem.getPrecoVip());
        travel.setIdAdmin(pegarViagem.getAdmin().getId());

        return ResponseEntity.ok().body(travel);
    }

    @Override
    public ResponseEntity<List<TravelResponse>> GetAllAtivo() {

        var pegarViagems = _travelRepository.findAll();
        List<TravelResponse> viagensResponse = new ArrayList<TravelResponse>();

        for (TravelModel iterable_element : pegarViagems) {
            if (iterable_element.getEstadoViagem().equals(StateTravelEnum.Ativo))
                viagensResponse.add(_mapping.ConverterparaTravelResponse(iterable_element));
        }

        return ResponseEntity.ok().body(viagensResponse);
    }

    @Override
    public ResponseEntity<List<TravelResponse>> GetAllByIdAdmin(String idAdmin) {

        var pegarViagems = _travelRepository.findAll();
        List<TravelResponse> viagensResponse = new ArrayList<TravelResponse>();

        for (TravelModel iterable_element : pegarViagems) {
            if (iterable_element.getAdmin().getId().equals(idAdmin)
                    && iterable_element.getEstadoViagem() != StateTravelEnum.Expirado)
                viagensResponse.add(_mapping.ConverterparaTravelResponse(iterable_element));
        }

        return ResponseEntity.ok().body(viagensResponse);
    }

    @Override
    public ResponseEntity<List<TravelResponse>> GetAll() {

        var pegarViagems = _travelRepository.findAll();
        List<TravelResponse> viagensResponse = new ArrayList<TravelResponse>();

        for (TravelModel iterable_element : pegarViagems) {
            if (iterable_element.getEstadoViagem() != StateTravelEnum.Expirado)
                viagensResponse.add(_mapping.ConverterparaTravelResponse(iterable_element));
        }

        return ResponseEntity.ok().body(viagensResponse);
    }

    @Override
    public ResponseEntity<List<TravelResponse>> UpdateAll() {
        var pegarTodasViagem = _travelRepository.findAll();
        var pegarData = _generiqueClasse.PegarDataAtual();

        for (TravelModel travelModel : pegarTodasViagem) {
            int dia = travelModel.getDia();
            String mes = _generiqueClasse.RetornarMes(travelModel.getMes().toUpperCase());
            int ano = travelModel.getAno();

            if (dia <= pegarData.getDayOfYear() && ano == pegarData.getYear()
                    && mes.equals(pegarData.getMonth().name())) {
                travelModel.setEstadoViagem(StateTravelEnum.Expirado);
                travelModel.setUpdateDate(_generiqueClasse.PegarDataAtual());

                _travelRepository.save(travelModel);
            }
        }

        return ResponseEntity.ok().body(null);
    }

}

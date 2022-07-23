package com.mobembo.mobembo.ApplicationCore.Generique;

import com.mobembo.mobembo.DomainServices.Model.Admin.TravelModel;
import com.mobembo.mobembo.DomainServices.Model.PDO.User.TravelUserDTO;
import com.mobembo.mobembo.DomainServices.Model.Response.Admin.TravelResponse;
import com.mobembo.mobembo.DomainServices.Model.User.TravelUserModel;

import org.modelmapper.ModelMapper;

public class Mapping {
    

    private ModelMapper mapper = new ModelMapper ();

    public TravelResponse ConverterparaTravelResponse(TravelModel viagem)
    {
        TravelResponse travel = mapper.map(viagem, TravelResponse.class);
        travel.setIdAdmin(viagem.getAdmin().getId());
        
        return travel;
    }

    public TravelModel ConverterparaTravelModel(TravelResponse viagem)
    {
        TravelModel travel = mapper.map(viagem, TravelModel.class);
        return travel;
    }
    public TravelUserModel ConverterparaTravelUserModel(TravelUserDTO viagem)
    {
        TravelUserModel travel = mapper.map(viagem, TravelUserModel.class);
        return travel;
    }

    public Object GlobalConversor(Object objectConversor, Object tipeConversor)
    {
        var testee = mapper.map(objectConversor, tipeConversor.getClass());
        return testee;
    }

    public TravelUserDTO ConverterparaTravelUserDTO(TravelUserDTO viagem)
    {
        TravelUserDTO travel = mapper.map(viagem, TravelUserDTO.class);
        return travel;
    }
}

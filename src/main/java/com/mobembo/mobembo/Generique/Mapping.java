package com.mobembo.mobembo.Generique;

import com.mobembo.mobembo.Model.Admin.TravelModel;
import com.mobembo.mobembo.Model.Request.Admin.TravelRequest;
import com.mobembo.mobembo.Model.Response.Admin.TravelResponse;

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
}

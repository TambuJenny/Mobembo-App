package com.mobembo.mobembo.Infrastruture.Repository.Admin;

import com.mobembo.mobembo.DomainServices.Model.Admin.TravelModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<TravelModel,String> {
    
}

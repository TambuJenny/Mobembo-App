package com.mobembo.mobembo.Repository.Admin;

import com.mobembo.mobembo.Model.Admin.TravelModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<TravelModel,String> {
    
}

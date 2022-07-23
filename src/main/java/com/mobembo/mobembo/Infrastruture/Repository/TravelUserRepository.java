package com.mobembo.mobembo.Infrastruture.Repository;

import com.mobembo.mobembo.DomainServices.Model.User.TravelUserModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelUserRepository extends JpaRepository<TravelUserModel,String> {
    
}

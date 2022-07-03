package com.mobembo.mobembo.Repository;

import com.mobembo.mobembo.Model.User.TravelUserModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelUserRepository extends JpaRepository<TravelUserModel,String> {
    
}

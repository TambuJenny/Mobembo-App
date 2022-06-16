package com.mobembo.mobembo.Repository;

import com.mobembo.mobembo.Model.User.DriverModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDriverRepository extends JpaRepository<DriverModel,String>{
    
}

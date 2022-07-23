package com.mobembo.mobembo.Infrastruture.Repository.Admin;

import com.mobembo.mobembo.DomainServices.Model.Admin.UserAdminModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAdminRepository extends JpaRepository<UserAdminModel,String>{
    
}

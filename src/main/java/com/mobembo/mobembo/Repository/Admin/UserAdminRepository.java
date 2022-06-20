package com.mobembo.mobembo.Repository.Admin;

import com.mobembo.mobembo.Model.Admin.UserAdminModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAdminRepository extends JpaRepository<UserAdminModel,String>{
    
}

package com.mobembo.mobembo.Infrastruture.Repository;

import com.mobembo.mobembo.DomainServices.Model.User.ClientModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserClientRepository extends JpaRepository<ClientModel,String>{
}

package com.mobembo.mobembo.Repository;

import com.mobembo.mobembo.Model.User.ClientModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserClientRepository extends JpaRepository<ClientModel,String>{
}

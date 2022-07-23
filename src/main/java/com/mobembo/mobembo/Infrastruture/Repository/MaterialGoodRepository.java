package com.mobembo.mobembo.Infrastruture.Repository;

import com.mobembo.mobembo.DomainServices.Model.User.MaterialGoodModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialGoodRepository extends JpaRepository<MaterialGoodModel,String> {
    
}

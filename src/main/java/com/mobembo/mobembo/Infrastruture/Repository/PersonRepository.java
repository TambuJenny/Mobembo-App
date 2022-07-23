package com.mobembo.mobembo.Infrastruture.Repository;


import com.mobembo.mobembo.DomainServices.Model.PersonModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel,String>  {

}

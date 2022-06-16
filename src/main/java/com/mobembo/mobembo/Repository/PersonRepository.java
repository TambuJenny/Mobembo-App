package com.mobembo.mobembo.Repository;


import com.mobembo.mobembo.Model.PersonModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel,String>  {

}

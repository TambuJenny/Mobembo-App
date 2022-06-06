package com.mobembo.mobembo.Interfaces.User;

import com.mobembo.mobembo.Model.User.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<UserModel,Integer> {
    
}

package com.web_services.springwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_services.springwebservices.entities.User;

/*
    Implements JpaRepository for User Entity
*/
public interface UserRepository extends JpaRepository<User,Long>{

}
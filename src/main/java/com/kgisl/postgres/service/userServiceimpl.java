package com.kgisl.postgres.service;

import java.util.List;

import com.kgisl.postgres.entity.login;
import com.kgisl.postgres.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class userServiceimpl implements userService  {
    
   
    @Autowired
    private UserRepository repository;

    @Override
    public List<login> findAll() {

        List<login> users = (List<login>) repository.findAll();

        return users;
    }
    

}
package com.kgisl.postgres.controller;

import java.util.List;

import com.kgisl.postgres.entity.login;
import com.kgisl.postgres.service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
* TeamController
*/
@Controller
public class userController {


    @Autowired
    private userService userservice;
 
    //  @GetMapping("/showCities")
    // public String findCities(Model model) {

    //     List<login> user = (List<login>) userservice.findAll();

    //     model.addAttribute("user", user);

    //     return "showUsers";
    // }
 

    @GetMapping("/")
    public @ResponseBody ResponseEntity<List<login>> all() {
        return new ResponseEntity<>(userservice.findAll(), HttpStatus.OK);
    }

    
   
}
package com.carportal.controller;

import com.carportal.entity.User;
import com.carportal.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private UserRepository userRepository;
    public AuthController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public ResponseEntity<String>createUser(
          @RequestBody User user

    ){
        Optional<User>opUser=userRepository.findByEmail(user.getEmail());
        if(opUser.isPresent()){

            return ResponseEntity<>
        }
    }
}



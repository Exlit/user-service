package com.example.user_service.controller;

import com.example.user_service.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {


    @GetMapping("/get")
    ResponseEntity<List<User>> getAllUsers() {
       return ResponseEntity.ok(List.of(new User(1, "Bob"), new User(2, "Josh")));
    }
}

package com.nagasai.Springboot.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagasai.Springboot.models.User;
import com.nagasai.Springboot.services.UserService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/users")

public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;  

    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }  
}

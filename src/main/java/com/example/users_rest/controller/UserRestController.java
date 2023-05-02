package com.example.users_rest.controller;

import com.example.users_rest.entity.User;
import com.example.users_rest.service.UserService;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {

    @Autowired
    UserService userService;
    @GetMapping("{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping("/")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("create")
    public ResponseEntity<User> create(@RequestBody User user){
        userService.save(user);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("update")
    public ResponseEntity<User> update(@RequestBody User user){
        userService.update(user);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("delete/{id}")
    public ResponseEntity<User> update(@PathVariable Long id){
        return ResponseEntity.ok().body(userService.deleteById(id));
    }
}

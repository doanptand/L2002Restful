package com.t3h.spring.controller;

import com.t3h.spring.entities.User;
import com.t3h.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.findAllUser();
    }

    @PostMapping("/add")
    public int addUser(@RequestBody  User user) {
        return userService.save(user);
    }
}

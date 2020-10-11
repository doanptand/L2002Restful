package com.t3h.spring.controller;

import com.t3h.spring.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Welcome to spring api";
    }

    @RequestMapping("/user")
    public User getUser() {
        return new User(1,"doanpt","doandeptrai","admin");
    }
}

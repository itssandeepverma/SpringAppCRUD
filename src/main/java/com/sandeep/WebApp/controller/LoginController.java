package com.sandeep.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login Page";
    }

    @RequestMapping("/register")
    public String register(){
        return "Register Page";
    }
}

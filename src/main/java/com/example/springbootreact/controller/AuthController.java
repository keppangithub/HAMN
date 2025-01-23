package com.example.springbootreact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String login() {
        return "login"; // Points to login.html
    }

    //http://localhost:8080/authorization-code/callback

    @GetMapping("/callback")
    public String loginCallback() {
        return "index"; // Points to login.html
    }

}

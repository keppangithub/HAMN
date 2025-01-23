package com.example.springbootreact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String login() {
        return "login"; // Points to login.html
    }

    @GetMapping("/auth/callback")
    public String loginCallback(@AuthenticationPrincipal OAuth2User principal) {
        if (principal != null) {
            System.out.println("Authenticated user: " + principal.getName());
        }
        return "index"; // Return the page you want after login
    }

}

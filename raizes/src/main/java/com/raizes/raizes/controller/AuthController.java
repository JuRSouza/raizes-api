package com.raizes.raizes.controller;

import com.raizes.raizes.config.JwtService;
import com.raizes.raizes.domain.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginRequest request) {

        String token = jwtService.gerarToken(request.getEmail());

        return Map.of("token", token);
    }
}
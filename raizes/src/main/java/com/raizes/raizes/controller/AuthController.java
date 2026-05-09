package com.raizes.raizes.controller;

import com.raizes.raizes.config.JwtService;
import com.raizes.raizes.domain.LoginRequest;
import com.raizes.raizes.domain.Usuario;
import com.raizes.raizes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, String> login(@RequestBody LoginRequest request) {

        Optional<Usuario> usuario = usuarioRepository.findByEmail(request.getEmail());

        if (usuario.isEmpty() ||
                !passwordEncoder.matches(request.getSenha(), usuario.get().getSenha())) {
            throw new RuntimeException("Credenciais inválidas");
        }

        String token = jwtService.gerarToken(usuario.get().getEmail());

        return Map.of("token", token);
    }
}
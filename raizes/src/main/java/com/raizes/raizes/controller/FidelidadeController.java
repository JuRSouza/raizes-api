package com.raizes.raizes.controller;

import com.raizes.raizes.service.FidelidadeService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/fidelidade")
public class FidelidadeController {

    private final FidelidadeService service;

    public FidelidadeController(FidelidadeService service) {
        this.service = service;
    }

    @GetMapping
    public Map<String, Object> consultar(@RequestParam Long clienteId) {
        return service.consultar(clienteId);
    }
}
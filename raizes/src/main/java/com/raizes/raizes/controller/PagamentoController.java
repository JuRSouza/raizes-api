package com.raizes.raizes.controller;

import com.raizes.raizes.service.PagamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoService service;

    public PagamentoController(PagamentoService service) {
        this.service = service;
    }

    @PostMapping("/mock")
    public Map<String, String> pagar(@RequestBody Map<String, Long> request) {
        return service.processarPagamento(request.get("pedidoId"));
    }
}
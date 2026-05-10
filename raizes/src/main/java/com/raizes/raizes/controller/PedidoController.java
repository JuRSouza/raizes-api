package com.raizes.raizes.controller;

import com.raizes.raizes.domain.Pedido;
import com.raizes.raizes.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido criar(@RequestBody Pedido pedido) {
        return service.salvar(pedido);
    }

    @GetMapping
    public List<Pedido> listar() {
        return service.listar();
    }

    @PatchMapping("/{id}/status")
    public Pedido atualizarStatus(
            @PathVariable Long id,
            @RequestBody Map<String, String> body) {

        return service.atualizarStatus(id, body.get("status"));
    }
}

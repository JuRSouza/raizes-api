package com.raizes.raizes.service;

import com.raizes.raizes.domain.Pedido;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoService {

    private final PedidoService pedidoService;

    public PagamentoService(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public Map<String, String> processarPagamento(Long pedidoId) {

        Pedido pedido = pedidoService.buscarPorId(pedidoId);

        pedidoService.atualizarStatus(pedidoId, "PAGO");

        Map<String, String> resposta = new HashMap<>();
        resposta.put("status", "APROVADO");
        resposta.put("pedidoId", pedidoId.toString());

        return resposta;
    }
}
package com.raizes.raizes.service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoService {

    public Map<String, String> processarPagamento(Long pedidoId) {

        Map<String, String> resposta = new HashMap<>();

        // simulação simples
        resposta.put("status", "APROVADO");
        resposta.put("pedidoId", pedidoId.toString());

        return resposta;
    }
}
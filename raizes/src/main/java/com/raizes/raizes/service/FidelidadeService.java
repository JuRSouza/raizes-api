package com.raizes.raizes.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FidelidadeService {

    public Map<String, Object> consultar(Long clienteId) {

        Map<String, Object> dados = new HashMap<>();
        dados.put("clienteId", clienteId);
        dados.put("pontos", 100);

        return dados;
    }
}

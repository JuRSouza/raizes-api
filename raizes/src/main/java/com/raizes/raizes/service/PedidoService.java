package com.raizes.raizes.service;


import com.raizes.raizes.domain.Pedido;
import com.raizes.raizes.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido salvar(Pedido pedido) {
        pedido.setStatus("AGUARDANDO_PAGAMENTO");
        return repository.save(pedido);
    }

    public List<Pedido> listar() {
        return repository.findAll();
    }
}


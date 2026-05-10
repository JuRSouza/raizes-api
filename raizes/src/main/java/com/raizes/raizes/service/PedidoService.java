package com.raizes.raizes.service;

import com.raizes.raizes.domain.Pedido;
import com.raizes.raizes.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido salvar(Pedido pedido) {
        if (pedido.getCanalPedido() == null || pedido.getCanalPedido().isBlank()) {
            throw new RuntimeException("canalPedido é obrigatório");
        }

        pedido.setStatus("AGUARDANDO_PAGAMENTO");
        pedido.setDataCriacao(LocalDateTime.now());

        if (pedido.getTotal() == null) {
            pedido.setTotal(21.00);
        }

        return repository.save(pedido);
    }

    public List<Pedido> listar() {
        return repository.findAll();
    }

    public Pedido atualizarStatus(Long id, String status) {

        Pedido pedido = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        pedido.setStatus(status);

        return repository.save(pedido);
    }

    public Pedido buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }
}


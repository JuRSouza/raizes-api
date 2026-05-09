package com.raizes.raizes.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String canalPedido; // APP, TOTEM, BALCAO

    private String status;

    private Double total;

    private LocalDateTime dataCriacao;

    @ManyToOne
    private Usuario cliente;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCanalPedido() { return canalPedido; }
    public void setCanalPedido(String canalPedido) { this.canalPedido = canalPedido; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }

    public Usuario getCliente() { return cliente; }
    public void setCliente(Usuario cliente) { this.cliente = cliente; }
}

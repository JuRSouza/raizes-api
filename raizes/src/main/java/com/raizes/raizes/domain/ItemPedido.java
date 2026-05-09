package com.raizes.raizes.domain;

import jakarta.persistence.*;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;

    private Double preco;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Pedido pedido;
}

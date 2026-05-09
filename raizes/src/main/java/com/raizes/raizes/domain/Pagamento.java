package com.raizes.raizes.domain;

import jakarta.persistence.*;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status; // APROVADO, RECUSADO

    private String metodo; // MOCK

    @OneToOne
    private Pedido pedido;
}

package com.raizes.raizes.service;

import com.raizes.raizes.domain.Estoque;
import com.raizes.raizes.repository.EstoqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    private final EstoqueRepository repository;

    public EstoqueService(EstoqueRepository repository) {
        this.repository = repository;
    }

    public List<Estoque> listar() {
        return repository.findAll();
    }

    public Estoque salvar(Estoque estoque) {
        return repository.save(estoque);
    }
}


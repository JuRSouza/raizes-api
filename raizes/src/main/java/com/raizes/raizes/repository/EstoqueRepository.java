package com.raizes.raizes.repository;

import com.raizes.raizes.domain.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
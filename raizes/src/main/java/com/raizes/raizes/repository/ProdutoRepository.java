package com.raizes.raizes.repository;

import com.raizes.raizes.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProdutoRepository extends JpaRepository<Produto, Long>  {
}

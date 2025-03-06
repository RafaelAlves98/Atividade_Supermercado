package com.atividade.supermercado.repository;

import com.atividade.supermercado.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}
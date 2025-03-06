package com.atividade.supermercado.repository;

import com.atividade.supermercado.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}
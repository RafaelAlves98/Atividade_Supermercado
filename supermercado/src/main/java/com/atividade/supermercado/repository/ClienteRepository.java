package com.atividade.supermercado.repository;

import com.atividade.supermercado.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
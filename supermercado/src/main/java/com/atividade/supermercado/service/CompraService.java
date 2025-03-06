package com.atividade.supermercado.service;

import com.atividade.supermercado.model.Compra;
import com.atividade.supermercado.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;

    public Compra salvar(Compra compra) {
        return compraRepository.save(compra);
    }

    public List<Compra> buscarTodos() {
        return compraRepository.findAll();
    }
}
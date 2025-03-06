package com.atividade.supermercado.service;

import com.atividade.supermercado.model.Venda;
import com.atividade.supermercado.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    public Venda salvar(Venda venda) {
        return vendaRepository.save(venda);
    }

    public List<Venda> buscarTodos() {
        return vendaRepository.findAll();
    }
}
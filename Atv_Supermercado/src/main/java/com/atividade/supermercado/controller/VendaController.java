package com.atividade.supermercado.controller;

import com.atividade.supermercado.model.Venda;
import com.atividade.supermercado.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @PostMapping
    public Venda criarVenda(@RequestBody Venda venda) {
        return vendaService.salvar(venda);
    }

    @GetMapping
    public List<Venda> obterTodasVendas() {
        return vendaService.buscarTodos();
    }
}
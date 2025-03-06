package com.atividade.supermercado.controller;

import com.atividade.supermercado.model.Compra;
import com.atividade.supermercado.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @PostMapping
    public Compra criarCompra(@RequestBody Compra compra) {
        return compraService.salvar(compra);
    }

    @GetMapping
    public List<Compra> obterTodasCompras() {
        return compraService.buscarTodos();
    }
}
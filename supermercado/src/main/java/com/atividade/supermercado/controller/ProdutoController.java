package com.atividade.supermercado.controller;

import com.atividade.supermercado.model.Produto;
import com.atividade.supermercado.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    @GetMapping
    public List<Produto> obterTodosProdutos() {
        return produtoService.buscarTodos();
    }
}
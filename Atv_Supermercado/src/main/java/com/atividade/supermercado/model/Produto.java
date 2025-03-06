package com.atividade.supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    private Long id;
    private String nome;
    private String categoria;
    private Double preco;
    private Integer estoque;
    private String status; // "DISPONIVEL" ou "FORA_DE_ESTOQUE"

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
    public Integer getEstoque() { return estoque; }
    public void setEstoque(Integer estoque) { this.estoque = estoque; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
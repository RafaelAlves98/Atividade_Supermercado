package com.atividade.supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Funcionario {
    @Id
    private Long id;
    private String nome;
    private String cpf;
    private Double comissaoPorVenda;
    private String cargo; // "VENDEDOR" ou "GERENTE"

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public Double getComissaoPorVenda() { return comissaoPorVenda; }
    public void setComissaoPorVenda(Double comissaoPorVenda) { this.comissaoPorVenda = comissaoPorVenda; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
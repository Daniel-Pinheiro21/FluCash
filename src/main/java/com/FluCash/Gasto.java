package com.flucash;

public class Gasto {
    private String descricao;
    private double valor;
    private Categoria categoria;

    public Gasto(String descricao, double valor, Categoria categoria) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do gasto não pode ser negativo.");
        }
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia.");
        }
        if (categoria == null) {
            throw new IllegalArgumentException("A categoria não pode ser nula.");
        }
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return String.format("- [%s] %s: R$ %.2f", categoria, descricao, valor);
    }
}
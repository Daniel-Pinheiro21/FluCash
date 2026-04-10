package com.flucash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Imports específicos em vez de usar o .*
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GerenciadorTest {

    private Gerenciador gerenciador;

    @BeforeEach
    void setUp() {
        gerenciador = new Gerenciador();
    }

    @Test
    void deveAdicionarGastoEListarCorretamente() {
        Gasto gasto = new Gasto("Mercado", 150.0, Categoria.ALIMENTACAO);
        gerenciador.adicionarGasto(gasto);

        assertEquals(1, gerenciador.listarGastos().size());
        assertEquals("Mercado", gerenciador.listarGastos().get(0).getDescricao());
        assertEquals(Categoria.ALIMENTACAO, gerenciador.listarGastos().get(0).getCategoria());
    }

    @Test
    void naoDevePermitirGastoComValorNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Gasto("Uber", -20.0, Categoria.TRANSPORTE);
        });
        assertEquals("O valor do gasto não pode ser negativo.", exception.getMessage());
    }

    @Test
    void deveCalcularTotalCorretamenteParaVariosGastos() {
        gerenciador.adicionarGasto(new Gasto("Luz", 100.0, Categoria.MORADIA));
        gerenciador.adicionarGasto(new Gasto("Cinema", 50.50, Categoria.LAZER));

        assertEquals(150.50, gerenciador.calcularTotal(), 0.001);
    }
}
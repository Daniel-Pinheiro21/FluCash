package com.FluCash;

// Importes explícitos para garantir que o IntelliJ ache o caminho
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GerenciadorTest {

    private Gerenciador meuGerenciador;

    @BeforeEach
    void setUp() {
        // Se a palavra Gerenciador continuar vermelha aqui,
        // verifique se o arquivo Gerenciador.java está na pasta src/main/java/com/FluCash
        this.meuGerenciador = new Gerenciador();
    }

    @Test
    void deveAdicionarGastoEListarCorretamente() {
        Gasto g1 = new Gasto("Mercado", 150.0, Categoria.ALIMENTACAO);
        meuGerenciador.adicionarGasto(g1);

        assertEquals(1, meuGerenciador.listarGastos().size());
        assertEquals("Mercado", meuGerenciador.listarGastos().get(0).getDescricao());
    }

    @Test
    void naoDevePermitirGastoComValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Gasto("Uber", -20.0, Categoria.TRANSPORTE);
        });
    }

    @Test
    void deveCalcularTotalCorretamenteParaVariosGastos() {
        meuGerenciador.adicionarGasto(new Gasto("Luz", 100.0, Categoria.MORADIA));
        meuGerenciador.adicionarGasto(new Gasto("Agua", 50.0, Categoria.MORADIA));

        assertEquals(150.0, meuGerenciador.calcularTotal(), 0.001);
    }
}

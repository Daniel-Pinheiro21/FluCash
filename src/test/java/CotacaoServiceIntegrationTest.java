package com.FluCash;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CotacaoServiceIntegrationTest {

    @Test
    public void deveRetornarCotacaoOuFallback() {
        CotacaoService service = new CotacaoService();
        String resultado = service.buscarCotacaoDolar();

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
        assertTrue(
                resultado.contains("R$")
                        || resultado.contains("indisponivel"),
                "Resposta inesperada: " + resultado
        );
    }
}

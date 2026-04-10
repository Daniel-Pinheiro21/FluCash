package com.FluCash;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ResumoFinanceiro {

    public static void exibirResumoPorCategoria(List<Gasto> gastos) {
        if (gastos.isEmpty()) {
            System.out.println("Nenhum gasto para resumir.");
            return;
        }

        Map<Categoria, Double> totalPorCategoria = gastos.stream()
                .collect(Collectors.groupingBy(
                        Gasto::getCategoria,
                        Collectors.summingDouble(Gasto::getValor)
                ));

        System.out.println("\n--- Resumo por Categoria ---");
        totalPorCategoria.forEach((cat, total) ->
                System.out.printf("%s: R$ %.2f\n", cat, total)
        );
    }
}

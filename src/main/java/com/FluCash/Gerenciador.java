package com.FluCash;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pela lógica de armazenamento e cálculos dos gastos.
 * Deve ficar na pasta src/main/java/com/FluCash/
 */
public class Gerenciador {
    // Lista que armazena todos os objetos do tipo Gasto
    private List<Gasto> gastos = new ArrayList<>();

    // Adiciona um novo gasto à lista
    public void adicionarGasto(Gasto gasto) {
        if (gasto != null) {
            this.gastos.add(gasto);
        }
    }

    // Retorna a lista completa de gastos para exibição ou relatórios
    public List<Gasto> listarGastos() {
        return new ArrayList<>(this.gastos);
    }

    // Soma o valor de todos os gastos usando Stream API
    public double calcularTotal() {
        return gastos.stream()
                .mapToDouble(Gasto::getValor)
                .sum();
    }
}

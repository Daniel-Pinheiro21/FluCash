package com.FluCash;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pela lógica de armazenamento e cálculos dos gastos.
 * Deve ficar na pasta src/main/java/com/FluCash/
 */
public class Gerenciador {

    private List<Gasto> gastos = new ArrayList<>();


    public void adicionarGasto(Gasto gasto) {
        if (gasto != null) {
            this.gastos.add(gasto);
        }
    }


    public List<Gasto> listarGastos() {
        return new ArrayList<>(this.gastos);
    }

    public double calcularTotal() {
        return gastos.stream()
                .mapToDouble(Gasto::getValor)
                .sum();
    }
}

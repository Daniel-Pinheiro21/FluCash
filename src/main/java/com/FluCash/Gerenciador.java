package com.flucash;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Gasto> gastos = new ArrayList<>();

    public void adicionarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public List<Gasto> listarGastos() {
        return gastos;
    }

    public double calcularTotal() {
        return gastos.stream().mapToDouble(Gasto::getValor).sum();
    }
}
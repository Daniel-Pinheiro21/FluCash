package com.flucash;

import java.util.Scanner;

public class MenuCLI {
    private Gerenciador gerenciador;
    private Scanner scanner;

    public MenuCLI() {
        this.gerenciador = new Gerenciador();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean rodando = true;
        System.out.println("=== Bem-vindo ao FluCash ===");

        while (rodando) {
            exibirOpcoes();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    adicionarGasto();
                    break;
                case "2":
                    listarGastos();
                    break;
                case "3":
                    verTotal();
                    break;
                case "4":
                    verResumo();
                    break;
                case "5":
                    rodando = false;
                    System.out.println("Saindo... O FluCash deseja uma ótima saúde financeira!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    private void exibirOpcoes() {
        System.out.println("\n1. Adicionar Gasto");
        System.out.println("2. Listar Todos os Gastos");
        System.out.println("3. Ver Total Geral");
        System.out.println("4. Ver Resumo por Categoria");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarGasto() {
        try {
            System.out.print("Descrição do gasto: ");
            String desc = scanner.nextLine();

            System.out.print("Valor (ex: 50.50): ");
            double valor = Double.parseDouble(scanner.nextLine());

            System.out.println("Escolha a categoria (1-ALIMENTACAO, 2-TRANSPORTE, 3-MORADIA, 4-LAZER, 5-SAUDE, 6-OUTROS): ");
            int catOpcao = Integer.parseInt(scanner.nextLine());
            Categoria categoriaSelecionada = Categoria.values()[catOpcao - 1];

            gerenciador.adicionarGasto(new Gasto(desc, valor, categoriaSelecionada));
            System.out.println("Gasto adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar gasto. Verifique os dados digitados.");
        }
    }

    private void listarGastos() {
        System.out.println("\n--- Seus Gastos ---");
        if (gerenciador.listarGastos().isEmpty()) {
            System.out.println("Nenhum gasto registrado ainda.");
        } else {
            gerenciador.listarGastos().forEach(System.out::println);
        }
    }

    private void verTotal() {
        System.out.printf("Total gasto: R$ %.2f\n", gerenciador.calcularTotal());
    }

    private void verResumo() {
        ResumoFinanceiro.exibirResumoPorCategoria(gerenciador.listarGastos());
    }
}

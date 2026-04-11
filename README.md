# FluCash — Gerenciador de Gastos Pessoais

![FluCash CI](https://github.com/Daniel-Pinheiro21/FluCash/actions/workflows/ci.yml/badge.svg)

Aplicação CLI em Java desenvolvida para o gerenciamento inteligente de finanças pessoais, focada em combater o descontrole financeiro gerado pelos pequenos gastos do dia a dia através de registros rápidos e resumos categorizados.

---

### 1. Descrição do Problema Real
Muitas pessoas perdem o controle das finanças por falta de um registro simples e rápido dos gastos diários. Pequenas despesas "invisíveis" (como lanches, transporte por aplicativo e assinaturas) se acumulam no fim do mês, gerando ansiedade financeira, endividamento e incapacidade de poupar e planejar o futuro. O atrito de abrir planilhas complexas faz com que muitos abandonem o hábito de anotar gastos.

### 2. Proposta da Solução
O **FluCash** atua como um assistente financeiro local e direto ao ponto. Sem a burocracia de telas complexas ou necessidade de internet, a aplicação de linha de comando (CLI) permite que o usuário registre despesas em segundos, categorize-as e visualize imediatamente resumos financeiros que mostram com exatidão para onde o dinheiro está indo.

### 3. Público-Alvo
* Jovens adultos e estudantes universitários que desejam iniciar o controle de suas finanças.
* Pessoas que buscam um sistema minimalista, rápido e livre de distrações para anotar despesas diárias.

### 4. Funcionalidades Principais
* **Registro de Gastos:** Inserção rápida de despesas com validação de dados (bloqueia valores negativos ou descrições vazias).
* **Categorização Inteligente:** Classificação dos gastos em categorias pré-definidas (Alimentação, Transporte, Moradia, Lazer, Saúde e Outros).
* **Listagem Total:** Visualização do histórico completo de gastos registrados na sessão.
* **Resumo Financeiro:** Geração de um relatório automático que agrupa e soma os gastos por categoria, auxiliando na identificação de gargalos no orçamento.
* **Cálculo de Total:** Exibição imediata da soma de todas as despesas registradas.

### 5. Tecnologias Utilizadas
* **Java 17:** Linguagem principal (Orientação a Objetos e Stream API).
* **Maven 3.9+:** Automação de build e gerenciamento de dependências.
* **JUnit 5:** Criação e execução de testes unitários automatizados.
* **Checkstyle:** Ferramenta de linting (análise estática) para garantir as regras de formatação do código.
* **GitHub Actions (CI/CD):** Pipeline de Integração Contínua para validação automática de código a cada novo commit.

---

### 6. Instalação e Execução

**Pré-requisitos**

* Java 17 (ou superior)
* Maven instalado

**Passos**

```bash
git clone [https://github.com/Daniel-Pinheiro21/FluCash.git](https://github.com/Daniel-Pinheiro21/FluCash.git)
cd FluCash
mvn package -DskipTests
java -jar target/flucash-1.0.0-jar-with-dependencies.jar
```

### 7. Testes e Lint

**Rodar testes (JUnit)**

```bash
mvn test
```

**Rodar análise estática (Checkstyle)**

```bash
mvn checkstyle:check
```

### 8. Exemplo de Uso

```text
╔════════════════════════════════════╗
║           FLUCASH v1.0.0           ║
║   Gerenciador de Gastos Pessoais   ║
╚════════════════════════════════════╝

=== Bem-vindo ao FluCash ===

1. Adicionar Gasto
2. Listar Todos os Gastos
3. Ver Total Geral
4. Ver Resumo por Categoria
5. Sair

Escolha uma opção: 1
Descrição do gasto: Supermercado
Valor (ex: 50.50): 150.00
Categoria (1-ALIMENTACAO, 2-TRANSPORTE, 3-MORADIA...): 1
✔ Gasto adicionado com sucesso!
```

### 9. Estrutura do Projeto (v1.0.0)

```text
FluCash/
├── src/
│   ├── main/java/com/FluCash/
│   │   ├── Categoria.java
│   │   ├── Gasto.java
│   │   ├── Gerenciador.java
│   │   ├── Main.java
│   │   ├── MenuCLI.java
│   │   └── ResumoFinanceiro.java
│   └── test/java/com/FluCash/
│       └── GerenciadorTest.java
├── .github/workflows/ci.yml
├── checkstyle.xml
├── pom.xml
└── README.md
```

### 10. Informações do Projeto

* **Versão Atual:** `1.0.0` (Versionamento Semântico)
* **Autor:** Daniel Pinheiro Antunes Nogueira
* **Instituição:** Centro Universitário de Brasília (CEUB) - FATECS
* **Link do Repositório Público:** [https://github.com/Daniel-Pinheiro21/FluCash](https://github.com/Daniel-Pinheiro21/FluCash)

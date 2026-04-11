# FluCash
---

![FluCash CI](https://github.com/Daniel-Pinheiro21/FluCash/actions/workflows/ci.yml/badge.svg)

Aplicação CLI em Java desenvolvida para o gerenciamento inteligente de finanças pessoais, focada em combater o descontrole financeiro gerado pelos pequenos gastos do dia a dia através de registros rápidos e resumos categorizados.

---

### 1. Problema Real

Muitas pessoas perdem o controle das finanças por falta de um registro simples e rápido dos gastos diários. Pequenas despesas "invisíveis" se acumulam no fim do mês, gerando ansiedade financeira, endividamento e dificuldade em planejar o futuro.

Além disso, usuários muitas vezes têm dificuldade em manter o hábito de anotar gastos em planilhas complexas ou aplicativos cheios de distrações visuais.

---

### 2. Proposta da Solução

O **FluCash** atua como um assistente financeiro local e direto ao ponto. Ele permite que o usuário registre despesas em segundos, categorize-as e visualize imediatamente resumos que mostram exatamente para onde o dinheiro está indo.

A escolha por uma interface de terminal (CLI) garante leveza, rapidez e foco total na funcionalidade de controle financeiro, sem distrações visuais.

---

### 3. Público-Alvo

* Jovens adultos e estudantes universitários que desejam iniciar o controle de suas finanças
* Pessoas que buscam um sistema rápido, livre de distrações e focado para anotar despesas diárias

---

### 4. Funcionalidades Principais

* **Registro de Gastos:** Inserção rápida de despesas com validação de dados
* **Categorização Inteligente:** Classificação dos gastos em categorias pré-definidas (Alimentação, Transporte, Moradia, etc.)
* **Monitoramento e Resumo:** Geração de um relatório automático que agrupa e soma os gastos por categoria
* **Segurança de Dados:** Validação que impede o cadastro de valores negativos ou nulos
* **Controle de Total:** Exibição imediata da soma de todas as despesas registradas

---

### 5. Tecnologias Utilizadas

* Java 17
* Maven 3.9+
* JUnit 5
* Checkstyle
* GitHub Actions (CI)

---

### 6. Instalação e Execução

**Pré-requisitos**

* Java 17 (ou superior)
* Maven instalado

**Passos**

```bash
git clone https://github.com/Daniel-Pinheiro21/FluCash.git
cd FluCash
mvn package -DskipTests
java -jar target/flucash-1.0.0-jar-with-dependencies.jar
```

---

### 7. Testes e Lint

**Rodar testes (JUnit)**

```bash
mvn test
```

**Rodar análise estática (Checkstyle)**

```bash
mvn checkstyle:check
```

---

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

---

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

---

### 10. Informações do Projeto

* **Versão Atual:** 1.0.0 (Versionamento Semântico)
* **Autor:** Daniel Pinheiro Antunes Nogueira
* **Instituição:** Centro Universitário de Brasília (CEUB) - FATECS
* **Link do Repositório Público:** https://github.com/Daniel-Pinheiro21/FluCash

# FluCash — Gerenciador de Gastos Pessoais

[![FluCash CI](https://github.com/Daniel-Pinheiro21/FluCash/actions/workflows/ci.yml/badge.svg)](https://github.com/Daniel-Pinheiro21/FluCash/actions/workflows/ci.yml)

---

## Descrição do Problema

Muitas pessoas — especialmente jovens adultos e estudantes — perdem o controle das finanças por falta de um registro simples e rápido dos gastos do dia a dia. Pequenas despesas esquecidas se acumulam e geram ansiedade financeira, endividamento e incapacidade de poupar.

## Proposta da Solução

O **FluCash** é uma aplicação de linha de comando (CLI) leve e objetiva que permite registrar despesas, categorizá-las e visualizar resumos financeiros. Sem burocracia, sem cadastro, sem internet — basta executar e começar a controlar.

## Público-Alvo

Estudantes, jovens adultos e qualquer pessoa que queira ter um controle básico e rápido de seus gastos pessoais sem depender de aplicativos complexos.

---

## Funcionalidades Principais

- Cadastro de gastos com descrição, valor e categoria
- Validação automática: rejeita valores negativos ou dados inválidos
- Listagem de todos os gastos registrados
- Cálculo do total geral acumulado
- Resumo financeiro agrupado por categoria (Alimentação, Transporte, Moradia, Lazer, Saúde, Outros)

---

## Tecnologias Utilizadas

| Tecnologia | Uso |
|------------|-----|
| Java 17 | Linguagem principal |
| Maven | Gerenciamento de dependências e build |
| JUnit 5 | Testes automatizados |
| Checkstyle | Análise estática / linting |
| GitHub Actions | Pipeline de CI |

---

## Estrutura do Projeto

```
FluCash/
├── src/
│   ├── main/java/com/FluCash/
│   │   ├── Main.java               # Ponto de entrada
│   │   ├── MenuCLI.java            # Interface de linha de comando
│   │   ├── Gerenciador.java        # Lógica de negócio
│   │   ├── Gasto.java              # Modelo de dados
│   │   ├── Categoria.java          # Enum de categorias
│   │   └── ResumoFinanceiro.java   # Relatório por categoria
│   └── test/java/com/FluCash/
│       └── GerenciadorTest.java    # Testes automatizados
├── .github/workflows/ci.yml        # Pipeline CI
├── checkstyle.xml                  # Regras de lint
├── pom.xml                         # Dependências Maven
└── README.md
```

---

## Pré-requisitos

- Java 17 ou superior instalado
- Maven 3.8 ou superior instalado

Verifique com:
```bash
java -version
mvn -version
```

---

## Instalação e Execução

### 1. Clone o repositório
```bash
git clone https://github.com/Daniel-Pinheiro21/FluCash.git
cd FluCash
```

### 2. Compile o projeto
```bash
mvn clean package -DskipTests
```

### 3. Execute a aplicação
```bash
java -jar target/flucash-1.0.0-jar-with-dependencies.jar
```

### Exemplo de uso

```
=== Bem-vindo ao FluCash ===

1. Adicionar Gasto
2. Listar Todos os Gastos
3. Ver Total Geral
4. Ver Resumo por Categoria
5. Sair
Escolha uma opcao: 1

Descricao do gasto: Almoco
Valor (ex: 50.50): 35.00
Categoria (1-ALIMENTACAO, 2-TRANSPORTE, 3-MORADIA, 4-LAZER, 5-SAUDE, 6-OUTROS): 1
Gasto adicionado com sucesso!
```

---

## Rodando os Testes

```bash
mvn test
```

Os testes cobrem:
- Adição e listagem de gastos (caminho feliz)
- Rejeição de valores negativos (entrada inválida)
- Cálculo correto do total com múltiplos gastos (caso limite)

---

## Rodando o Lint (Checkstyle)

```bash
mvn checkstyle:check
```

O relatório de violações é gerado em `target/checkstyle-result.xml`. A pipeline de CI já executa o lint automaticamente a cada push.

---

## Pipeline de CI (GitHub Actions)

A cada `push` ou `pull request` na branch `main`, o GitHub Actions executa automaticamente:

1. Checkout do código
2. Configuração do Java 17
3. Compilação + Lint (Checkstyle) + Testes (`mvn clean verify`)

Veja o workflow em: [`.github/workflows/ci.yml`](.github/workflows/ci.yml)

---

## Versão Atual

**v1.0.0** — Versão inicial com funcionalidades core de registro e resumo de gastos.

---

## Autor

**Daniel Pinheiro Antunes Nogueira**
Bootcamp II — UniCEUB
Repositório: [https://github.com/Daniel-Pinheiro21/FluCash](https://github.com/Daniel-Pinheiro21/FluCash)

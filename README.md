# Método de Eliminação de Gauss em Java

Este projeto implementa o **método de Eliminação de Gauss** para resolver sistemas lineares da forma:

Ax = b

O programa lê a matriz aumentada informada pelo usuário, realiza o processo de **escalonamento** (eliminação dos elementos abaixo da diagonal) e, em seguida, executa a **substituição regressiva** para encontrar os valores das incógnitas.

---

## ✨ Funcionalidades

* Leitura dinâmica do sistema linear (nº de equações e variáveis).
* Construção da matriz aumentada.
* Escalonamento usando o método de Gauss.
* Cálculo das soluções via substituição regressiva.
* Impressão da matriz inicial, da matriz escalonada e dos resultados finais.

---

## 📌 Como funciona

1. **Entrada do usuário:**
   O programa solicita o número de equações e variáveis e preenche a matriz aumentada com os coeficientes e termos independentes.

2. **Escalonamento:**
   A função `matrizGauss()` aplica eliminações sucessivas, zerando os elementos abaixo do pivô.

3. **Substituição regressiva:**
   A função `resultado()` resolve o sistema a partir da última equação até a primeira.

4. **Saída:**
   São exibidos:

   * Matriz inicial
   * Matriz escalonada
   * Valores finais das incógnitas

---

## 🚀 Execução

Compile o código:

```bash
javac gauss.java
```

Execute:

```bash
java gauss
```

Insira os valores quando solicitado, e o programa exibirá todo o processo.

---

## 🧮 Exemplo de saída

```
Matriz inicial
[ 2.00 ] [ 3.00 ] [ 1.00 ] [ 5.00 ]
[ 4.00 ] [ 1.00 ] [ 2.00 ] [ 6.00 ]

Matriz final
[ 2.00 ] [ 3.00 ] [ 1.00 ] [ 5.00 ]
[ 0.00 ] [ -5.00 ] [ 0.00 ] [ -4.00 ]

x1 = 1.00
x2 = 0.80
x3 = 0.00
```

---

## 📁 Estrutura do código

* `imprimeMatriz()` → Exibe a matriz formatada
* `achaFator()` → Calcula o fator de eliminação
* `alterarLinha()` → Aplica o fator para eliminar termos
* `matrizGauss()` → Realiza o escalonamento
* `resultado()` → Faz a substituição regressiva
* `main()` → Controla o fluxo geral do programa

---

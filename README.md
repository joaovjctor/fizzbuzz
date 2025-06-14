# 🧪 FizzBuzz em Java usando TDD

Este repositório contém uma implementação do clássico problema **FizzBuzz** utilizando a abordagem de **TDD (Test-Driven Development)** com **JUnit 5**. O objetivo é demonstrar uma prática limpa e iterativa de desenvolvimento orientado a testes, incluindo testes unitários e parametrizados.

---

## 📌 Descrição do Problema

O problema FizzBuzz consiste em imprimir os números de 1 a 100 com as seguintes condições:

- Para números múltiplos de 3, imprimir `"Fizz"`.
- Para números múltiplos de 5, imprimir `"Buzz"`.
- Para números múltiplos de ambos (3 e 5), imprimir `"FizzBuzz"`.
- Caso contrário, imprimir o próprio número.

### ✅ Exemplos

| Entrada | Saída      |
|--------:|------------|
| 3       | Fizz       |
| 5       | Buzz       |
| 15      | FizzBuzz   |
| 2       | 2          |

---

## 🔁 Ciclo de Desenvolvimento com TDD

Este projeto seguiu rigorosamente o ciclo TDD:

1. **Escreva um teste que falhe.**
2. **Implemente o mínimo necessário para passar o teste.**
3. **Refatore mantendo os testes verdes.**
4. **Repita o processo para novas regras.**

---

## 🧪 Como Rodar os Testes

### 1. ✅ Pré-requisitos

- **Java 11+**
- **Maven** (ou outro gerenciador de dependências com suporte ao JUnit 5)
- IDE com suporte a JUnit (como IntelliJ IDEA ou Eclipse)

### 2. 🔧 Executar os testes

- Clique com o botão direito nos arquivos de teste (`FizzBuzzTest`, `FizzBuzzParametrizedTest`) e escolha **Run Tests**.

### 3. 🧪 Testes Implementados
- testDivisibleByThree() – verifica se múltiplos de 3 retornam "Fizz".

- testDivisibleByFive() – verifica se múltiplos de 5 retornam "Buzz".

- testNotDivisibleByThreeOrFive() – retorna o próprio número.

- testFizzBuzz(int input, String expected) – teste parametrizado com múltiplas entradas.

---

Desenvolvido por João Victor como parte do estágio supervisionado do programa LabTech – UDF.
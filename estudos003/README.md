# 🏦 Sistema de Conta Bancária em Java  

Este projeto implementa um **sistema bancário simples**, permitindo que um usuário crie uma conta, realize depósitos e saques, e visualize seu saldo atualizado.  

## 📌 Funcionalidades  
✅ Criar uma conta bancária informando o **nome do titular**.  
✅ Permitir um **depósito inicial opcional**.  
✅ Exibir os detalhes da conta, incluindo **número da conta, nome do titular e saldo**.  
✅ Realizar saques, aplicando uma **taxa fixa de R$5,00**.  

## 📂 Estrutura do Projeto  
O projeto contém duas classes principais:  

### 🔹 `Conta.java` (Modelo de Conta Bancária)  
Classe que representa uma conta bancária, armazenando os seguintes atributos:  
- **`nome`** → Nome do titular da conta.  
- **`conta`** → Número da conta (fixo como `255` no código).  
- **`saldo`** → Armazena o saldo da conta (**encapsulado como `private`** para segurança).  

Além disso, contém métodos para manipulação do saldo:  
- `getSaldo()` → Retorna o saldo atual da conta.  
- `setSaldoDep(double saldo)` → Adiciona um valor ao saldo (depósito).  
- `setSaldoSac(double saldo)` → Subtrai um valor do saldo (saque), adicionando uma **taxa fixa de R$5,00**.  
- `mostrarConta()` → Exibe os detalhes da conta no console.  

---

### 🔹 `estudos003.java` (Classe Principal)  
Classe responsável pela **interação com o usuário** por meio do console.  

1. **Criação da Conta**: O usuário insere seu **nome** e recebe um número fixo de conta.  
2. **Depósito Inicial**: Pergunta se o usuário deseja fazer um depósito inicial (`S/N`).  
3. **Exibição dos Dados**: Mostra as informações da conta após a criação.  
4. **Saque**: O usuário insere um valor para saque, e o sistema desconta **o valor mais uma taxa de R$5,00**.  
5. **Exibição Final**: Os detalhes da conta são exibidos novamente após a transação.  

---

## 📚 Conceitos de Java Aplicados  
✅ **Programação Orientada a Objetos (POO)** → Uso de classes para modelar uma conta bancária.  
✅ **Encapsulamento** → O saldo é privado e acessado/modificado apenas por métodos (`getSaldo()` e `setSaldoDep()`).  
✅ **Manipulação de Entrada/Saída** → Uso de `Scanner` para receber dados do usuário.  
✅ **Estruturas de Controle** → `switch-case` para validar a decisão de depósito inicial.  
✅ **Métodos e Modificadores de Acesso** → `private` para o saldo e métodos públicos para manipulação.  



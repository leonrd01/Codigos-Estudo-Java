# 🏦 Gerenciador de Conta Bancária em Java  

Este projeto implementa um **sistema simples de conta bancária**, permitindo ao usuário criar uma conta, realizar depósitos e saques. O código foi desenvolvido utilizando **Programação Orientada a Objetos (POO)** e conceitos essenciais de **Java**.  

## 📌 Funcionalidades  
✅ Criar uma conta bancária com nome do titular e número fixo.  
✅ Permitir um **depósito inicial opcional** ao criar a conta.  
✅ Exibir os dados da conta (número, titular e saldo).  
✅ Realizar saques, aplicando uma **taxa fixa de R$5,00**.  
✅ Garantir o encapsulamento do saldo da conta.  

## 📂 Estrutura do Projeto  
O projeto contém duas classes principais:  

### 🔹 `Conta.java` (Modelo da Conta)  
Classe que representa uma conta bancária, armazenando os seguintes atributos:  
- **`nome`** → Nome do titular.  
- **`conta`** → Número da conta (fixo no código como 255).  
- **`saldo`** → Armazena o saldo da conta (**privado para garantir encapsulamento**).  

Além disso, contém métodos para manipulação da conta:  
- `getSaldo()` → Retorna o saldo atual da conta.  
- `setSaldoDep(double valor)` → Adiciona um valor ao saldo (depósito).  
- `setSaldoSac(double valor)` → Subtrai um valor do saldo (saque), adicionando uma taxa fixa de **R$5,00**.  
- `mostrarConta()` → Exibe as informações da conta.  

---

### 🔹 `estudos003.java` (Classe Principal)  
Classe responsável pela **interação com o usuário** por meio do console.  
1. **Criação da Conta**: O usuário insere seu nome para criar a conta.  
2. **Depósito Inicial**: O usuário pode escolher se deseja fazer um depósito inicial (`S/N`).  
3. **Exibição dos Dados**: Mostra as informações da conta após a criação.  
4. **Saque**: O usuário insere um valor para saque. Se houver saldo suficiente, o valor é descontado junto com a taxa de R$5,00.  
5. **Exibição Final**: Os detalhes da conta são exibidos novamente após a transação.  

---

## 📚 Conceitos de Java Aplicados  
✅ **Programação Orientada a Objetos (POO)** → Uso de classes e objetos para representar a conta bancária.  
✅ **Encapsulamento** → O saldo é privado e só pode ser alterado por métodos específicos.  
✅ **Manipulação de Entrada/Saída** → Uso da classe `Scanner` para interagir com o usuário.  
✅ **Estruturas de Controle** → Uso de `switch-case` para decidir se o usuário fará um depósito inicial.  
✅ **Métodos e Modificadores de Acesso** → Métodos `get` e `set` para acessar e modificar o saldo com regras específicas.  
✅ **Tratamento de Strings e Números** → Uso de `next()` e `nextDouble()` para capturar entradas do usuário.  


---



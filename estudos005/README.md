# 🏨 Sistema de Hospedagem em Java  

Este projeto implementa um **sistema de gerenciamento de hospedagem**, permitindo que um usuário registre hóspedes, escolha quartos disponíveis e visualize a ocupação.  

## 📌 Funcionalidades  
✅ Registrar hóspedes informando **nome, e-mail e número do quarto**.  
✅ Garantir que um quarto **não seja ocupado por mais de um hóspede**.  
✅ Exibir a **lista de quartos ocupados** e seus respectivos hóspedes.  
✅ Limitar a quantidade de hospedagens a **10 hóspedes por vez**.  
✅ Exibir mensagens de erro caso ocorra uma entrada inválida.  
✅ Permitir novas hospedagens até que o usuário decida encerrar o processo.  

## 📂 Estrutura do Projeto  
O projeto contém duas classes principais:  

### 🔹 `Hospedagem.java` (Modelo de Hóspede)  
Classe que representa um hóspede, armazenando os seguintes atributos:  
- **`nome`** → Nome do hóspede.  
- **`email`** → E-mail do hóspede.  
- **`quarto`** → Número do quarto ocupado.  

Além disso, contém um método para exibição dos dados:  
- `ListaQuartos()` → Exibe o número do quarto e os dados do hóspede.  

---

### 🔹 `estudos005.java` (Classe Principal)  
Classe responsável pela **interação com o usuário** por meio do console.  

1. **Solicita a quantidade de hóspedes** a serem cadastrados (máximo de 10 por vez).  
2. **Lê os dados** de cada hóspede (nome, e-mail, número do quarto).  
3. **Valida se o quarto já está ocupado**, garantindo que não seja duplicado.  
4. **Exibe a lista de quartos ocupados** e seus respectivos hóspedes.  
5. **Permite que o usuário realize novas hospedagens** ou encerre o programa.  

---

## 📚 Conceitos de Java Aplicados  
✅ **Programação Orientada a Objetos (POO)** → Uso de classes para modelar hóspedes e quartos.  
✅ **Arrays** → Armazena múltiplas instâncias da classe `Hospedagem`.  
✅ **Manipulação de Entrada/Saída** → Uso de `Scanner` para receber dados do usuário.  
✅ **Estruturas de Repetição (`do-while`, `for`)** → Para capturar dados e validar quartos ocupados.  
✅ **Tratamento de Exceções (`try-catch`)** → Para capturar erros e garantir entradas válidas.  
✅ **Condicionais (`if-else`)** → Para validar limites de hospedagem e verificar ocupação dos quartos.  


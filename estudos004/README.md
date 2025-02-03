# 📊 Cadastro e Análise de Pessoas em Java  

Este projeto permite **cadastrar um conjunto de pessoas** e calcular estatísticas como **altura média** e **percentual de pessoas com menos de 16 anos**.  

## 📌 Funcionalidades  
✅ Cadastrar um número `n` de pessoas, informando **nome, idade e altura**.  
✅ Exibir os dados cadastrados na tela.  
✅ Calcular e exibir a **altura média** do grupo.  
✅ Calcular e exibir a **porcentagem de pessoas com menos de 16 anos**.  
✅ Listar os nomes das pessoas com menos de 16 anos.  

## 📂 Estrutura do Projeto  
O projeto contém duas classes principais:  

### 🔹 `Pessoas.java` (Modelo de Pessoa)  
Classe que representa uma pessoa, armazenando os seguintes atributos:  
- **`nome`** → Nome da pessoa.  
- **`idade`** → Idade da pessoa.  
- **`altura`** → Altura da pessoa.  

Além disso, contém métodos para cálculos estatísticos:  
- `calcMedia(double somaAlt, double n)` → Calcula a altura média das pessoas cadastradas.  
- `porcent(int somaIdade, int nmr)` → Calcula a porcentagem de pessoas com menos de 16 anos.  

---

### 🔹 `estudos004.java` (Classe Principal)  
Classe responsável pela **interação com o usuário** por meio do console.  

1. **Recebe o número de pessoas** a serem cadastradas.  
2. **Lê os dados** de cada pessoa (nome, idade, altura) e os armazena em um array.  
3. **Calcula estatísticas**, como:  
   - Altura média do grupo.  
   - Percentual de pessoas menores de 16 anos.  
4. **Exibe os dados e estatísticas** no console.  

---

## 📚 Conceitos de Java Aplicados  
✅ **Programação Orientada a Objetos (POO)** → Uso de classes para representar as pessoas.  
✅ **Arrays** → Armazena múltiplas instâncias da classe `Pessoas`.  
✅ **Manipulação de Entrada/Saída** → Uso de `Scanner` para interação com o usuário.  
✅ **Estruturas de Repetição** → `for` para percorrer o array e coletar informações.  
✅ **Conversão de Tipos (`casting`)** → Cálculo de porcentagem utilizando `(double) somaIdade / nmr`.  

---


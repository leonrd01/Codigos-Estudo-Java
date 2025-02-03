# 📦 Sistema de Gerenciamento de Produtos em Java  

Este projeto permite **cadastrar e gerenciar um produto**, possibilitando adicionar ou remover unidades do estoque.  

## 📌 Funcionalidades  
✅ Cadastrar um produto informando **nome, preço e quantidade inicial**.  
✅ Exibir os dados do produto na tela.  
✅ Adicionar unidades ao estoque.  
✅ Remover unidades do estoque.  
✅ Calcular o **valor total do estoque** (preço × quantidade).  

## 📂 Estrutura do Projeto  
O projeto contém duas classes principais:  

### 🔹 `Produto.java` (Modelo de Produto)  
Classe que representa um produto, armazenando os seguintes atributos:  
- **`nome`** → Nome do produto.  
- **`preco`** → Preço unitário do produto.  
- **`quantidade`** → Quantidade disponível no estoque.  

Além disso, contém métodos para manipulação dos produtos:  
- `valortotal()` → Retorna o valor total do estoque (`preco * quantidade`).  
- `addProduto(int quantidade)` → Adiciona unidades ao estoque.  
- `removProduto(int quantidade)` → Remove unidades do estoque.  
- `mostrarProduto()` → Exibe os detalhes do produto.  

---

### 🔹 `estudo.java` (Classe Principal)  
Classe responsável pela **interação com o usuário** por meio do console.  

1. **Recebe os dados do produto** (nome, preço e quantidade).  
2. **Exibe os detalhes do produto** antes de qualquer alteração.  
3. **Pergunta ao usuário se deseja adicionar ou remover unidades**.  
4. **Atualiza a quantidade do produto no estoque** com base na escolha do usuário.  
5. **Exibe os detalhes atualizados do produto**.  

---

## 📚 Conceitos de Java Aplicados  
✅ **Programação Orientada a Objetos (POO)** → Uso de classes para representar os produtos.  
✅ **Manipulação de Entrada/Saída** → Uso de `Scanner` para interação com o usuário.  
✅ **Estruturas de Controle** → `switch-case` para decidir a operação (adicionar/remover unidades).  
✅ **Encapsulamento** → Métodos para modificar atributos (`addProduto()` e `removProduto()`).  
✅ **Cálculos Simples** → Multiplicação para calcular o valor total do estoque.  






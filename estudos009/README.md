# 🏷️ Sistema de Cadastro de Produtos em Java  

Este projeto implementa um **sistema de gerenciamento de produtos**, permitindo a compra de produtos **nacionais, importados ou usados**, com preços ajustados conforme suas categorias.  

## 📌 Funcionalidades  
✅ Cadastrar produtos informando **nome e preço**.  
✅ Permitir que o usuário escolha entre **produto nacional, importado ou usado**.  
✅ Aplicar **taxas adicionais** a produtos importados.  
✅ Registrar a **data de fabricação** para produtos usados.  
✅ Exibir **etiquetas de preço personalizadas** de acordo com o tipo de produto.  

## 📂 Estrutura do Projeto  
O projeto contém **quatro classes principais** para representar os diferentes tipos de produtos:  

### 🔹 `Produto.java` (Classe Base)  
Classe que representa um produto genérico, armazenando:  
- **`nome`** → Nome do produto.  
- **`preco`** → Preço do produto (**privado, acessado por `getPreco()` e `setPreco()`**).  

Além disso, contém um método:  
- `taxar(double taxa)` → Método para adicionar um valor extra ao preço (usado para produtos importados).  

---

### 🔹 `ProdutoImportado.java` (Produto com Taxa)  
Classe que **herda de `Produto`** e adiciona um atributo extra:  
- **`taxa`** → Valor adicional que é somado ao preço base.  

---

### 🔹 `ProdutoUsado.java` (Produto com Data de Fabricação)  
Classe que **herda de `Produto`** e adiciona um atributo extra:  
- **`dataF`** → Data de fabricação do produto.  

---

### 🔹 `estudos009.java` (Classe Principal)  
Classe responsável pela **interação com o usuário** por meio do console.  

1. **Pergunta quantos produtos serão cadastrados**.  
2. **Solicita informações para cada produto**, permitindo escolher entre:  
   - **Produto nacional** → Apenas nome e preço.  
   - **Produto importado** → Nome, preço e taxa extra.  
   - **Produto usado** → Nome, preço e data de fabricação.  
3. **Armazena os produtos em um array** e processa suas informações.  
4. **Exibe a etiqueta de preço de cada produto**, com detalhes adicionais conforme o tipo.  

---

## 📚 Conceitos de Java Aplicados  
✅ **Programação Orientada a Objetos (POO)** → Uso de classes e herança para especializar tipos de produtos.  
✅ **Encapsulamento** → O preço do produto é privado e acessado via métodos `getPreco()` e `setPreco()`.  
✅ **Herança (`extends`)** → Classes `ProdutoImportado` e `ProdutoUsado` herdam de `Produto`.  
✅ **Polimorfismo** → Uso de um array de `Produto` para armazenar diferentes tipos de produtos.  
✅ **Manipulação de Datas (`LocalDate`)** → Registro e formatação da data de fabricação de produtos usados.  
✅ **Manipulação de Entrada/Saída** → Uso de `Scanner` para receber dados do usuário.  
✅ **Estruturas de Controle (`switch-case`)** → Para escolher entre produto nacional, importado ou usado.  


# 🛒 Sistema de Pedidos em Java  

Este projeto implementa um **sistema de gerenciamento de pedidos**, permitindo que um cliente realize compras, adicione produtos ao pedido e veja um resumo com o status da compra.  

## 📌 Funcionalidades  
✅ Cadastrar um **cliente**, informando nome, e-mail e data de nascimento.  
✅ Registrar um **pedido**, escolhendo a quantidade de produtos desejados.  
✅ Adicionar **produtos ao pedido**, informando nome, preço e quantidade.  
✅ Calcular o **subtotal de cada produto** e o **valor total do pedido**.  
✅ Exibir um **resumo do pedido**, incluindo data, status e detalhes do cliente.  

## 📂 Estrutura do Projeto  
O projeto contém quatro classes principais e uma enumeração para o status do pedido:  

### 🔹 `Produtos.java` (Modelo de Produto)  
Classe que representa um produto no pedido, armazenando:  
- **`nomeP`** → Nome do produto.  
- **`preco`** → Preço unitário (**privado e acessado por métodos `get` e `set`**).  
- **`qnt`** → Quantidade do produto no pedido.  

Além disso, contém métodos para cálculos:  
- `subTot()` → Retorna o subtotal do produto (`preco * qnt`).  

---

### 🔹 `cliente.java` (Modelo de Cliente)  
Classe que representa um cliente, armazenando:  
- **`nome`** → Nome do cliente.  
- **`email`** → Endereço de e-mail do cliente.  
- **`dataNasci`** → Data de nascimento (**formatada como `dd/MM/yyyy`**).  

Além disso, contém um método:  
- `datas(String data)` → Converte a data informada pelo usuário para o formato correto (`LocalDate`).  

---

### 🔹 `Status.java` (Enumeração de Status do Pedido)  
Define os **estágios do pedido**, podendo ser:  
- **Pagamento_pendente**  
- **Processando**  
- **Pago**  
- **Enviado**  

---

### 🔹 `estudos008.java` (Classe Principal)  
Classe responsável pela **interação com o usuário** por meio do console.  

1. **Solicita os dados do cliente** (nome, e-mail e data de nascimento).  
2. **Pergunta quantos produtos serão adicionados ao pedido**.  
3. **Lê os dados de cada produto** (nome, preço e quantidade).  
4. **Calcula o subtotal de cada produto e o valor total do pedido**.  
5. **Exibe um resumo do pedido**, incluindo:  
   - **Data e hora da compra**.  
   - **Status atual do pedido** (`Processando`).  
   - **Dados do cliente**.  
   - **Lista de produtos adquiridos** com subtotal individual.  
   - **Preço total da compra**.  

---

## 📚 Conceitos de Java Aplicados  
✅ **Programação Orientada a Objetos (POO)** → Uso de classes para representar Cliente, Produto e Pedido.  
✅ **Encapsulamento** → O preço do produto é privado e acessado por métodos `getPreco()` e `setPreco()`.  
✅ **Manipulação de Datas** → Uso de `LocalDate` e `DateTimeFormatter` para formatar e converter datas.  
✅ **Arrays** → Armazena múltiplos produtos dentro do pedido.  
✅ **Enums** → Uso da enum `Status` para definir o status do pedido.  
✅ **Manipulação de Entrada/Saída** → Uso de `Scanner` para receber dados do usuário.  
✅ **Estruturas de Repetição (`for`)** → Para capturar e exibir os produtos adicionados ao pedido.  



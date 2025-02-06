# 🏦 Sistema de Cálculo de Impostos em Java  

Este projeto implementa um **sistema de arrecadação de impostos**, permitindo que contribuintes do tipo **Pessoa Física** e **Pessoa Jurídica** sejam cadastrados e tenham seus impostos calculados conforme regras específicas.  

## 📌 Funcionalidades  
✅ Cadastrar contribuintes informando **nome e renda anual**.  
✅ Diferenciar entre **Pessoa Física** e **Pessoa Jurídica**.  
✅ Aplicar **regras de tributação diferentes** para cada tipo de contribuinte.  
✅ Calcular o **valor do imposto devido** individualmente.  
✅ Exibir a **lista de contribuintes e seus impostos**.  
✅ Exibir o **total arrecadado em impostos**.  

## 📂 Estrutura do Projeto  
O projeto contém **três classes principais** e uma classe abstrata base:  

### 🔹 `Contribuente.java` (Classe Abstrata)  
Classe base que representa um contribuinte, armazenando:  
- **`nome`** → Nome do contribuinte.  
- **`rendaA`** → Renda anual do contribuinte (**privada, acessada por métodos `get` e `set`**).  
- **`Imp`** → Valor do imposto devido (**protegido para ser manipulado pelas subclasses**).  

Além disso, contém:  
- **Método abstrato `tax()`**, que deve ser implementado pelas subclasses.  
- **Método `getImp()`**, que retorna o imposto calculado.  

---

### 🔹 `PessoaFisica.java` (Cálculo para Pessoa Física)  
Classe que **herda de `Contribuente`** e adiciona um atributo extra:  
- **`gastoS`** → Gastos com saúde (usados para dedução no imposto).  

**Regras de tributação:**  
- Se a renda anual for **inferior a R$20.000**, o imposto será **15% da renda**.  
- Se a renda anual for **igual ou superior a R$20.000**, o imposto será **25% da renda**.  
- Em ambos os casos, há uma dedução de **50% dos gastos com saúde**.  

---

### 🔹 `PessoaJuridica.java` (Cálculo para Pessoa Jurídica)  
Classe que **herda de `Contribuente`** e adiciona um atributo extra:  
- **`qntF`** → Número de funcionários da empresa.  

**Regras de tributação:**  
- Se a empresa tem **menos de 10 funcionários**, o imposto será **16% da renda anual**.  
- Se a empresa tem **10 funcionários ou mais**, o imposto será **14% da renda anual**.  

---

### 🔹 `estudos010.java` (Classe Principal)  
Classe responsável pela **interação com o usuário** por meio do console.  

1. **Pergunta quantos contribuintes serão cadastrados**.  
2. **Lê os dados de cada contribuinte**, permitindo escolher entre:  
   - **Pessoa Física** → Nome, renda anual e gastos com saúde.  
   - **Pessoa Jurídica** → Nome, renda anual e número de funcionários.  
3. **Calcula o imposto devido para cada contribuinte** com base nas regras.  
4. **Exibe a lista de contribuintes com o valor do imposto de cada um**.  
5. **Exibe o total arrecadado em impostos**.  

---

## 📚 Conceitos de Java Aplicados  
✅ **Programação Orientada a Objetos (POO)** → Uso de classes para modelar diferentes tipos de contribuintes.  
✅ **Herança (`extends`)** → As classes `PessoaFisica` e `PessoaJuridica` herdam de `Contribuente`.  
✅ **Polimorfismo** → Uso do array de `Contribuente[]` para armazenar objetos de diferentes subclasses.  
✅ **Abstração (`abstract`)** → A classe `Contribuente` define um método abstrato `tax()`, que é implementado nas subclasses.  
✅ **Encapsulamento** → O atributo `rendaA` é privado e acessado por métodos `get` e `set`.  
✅ **Estruturas de Controle (`if-else`)** → Para determinar as alíquotas corretas dos impostos.  
✅ **Manipulação de Entrada/Saída** → Uso de `Scanner` para capturar dados do usuário.  
✅ **Estruturas de Repetição (`for`)** → Para processar múltiplos contribuintes.  


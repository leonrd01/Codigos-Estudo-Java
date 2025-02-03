package estudos002;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valortotal() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		 this.quantidade += quantidade; 
	}
	
	public void removProduto(int quantidade) {
		 this.quantidade -= quantidade;
	}
	
	public void mostrarProduto() {
		System.out.println("Produto 01");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
	}
   
}

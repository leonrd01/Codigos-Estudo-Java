package estudos009;

public class Produto {
	public String nome;
	private double preco;
	
	
	public Produto() {
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void taxar(double taxa) {
		preco += taxa;
			
	}
	

}

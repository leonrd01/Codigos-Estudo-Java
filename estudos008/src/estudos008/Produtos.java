package estudos008;

public class Produtos {
	
	public String nomeP;
	private double preco;
	public int qnt;
	
	
	public double subTot() {
		return preco*qnt;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	

}

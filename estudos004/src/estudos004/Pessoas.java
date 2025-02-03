package estudos004;

public class Pessoas {
	
	public String nome;
	public double altura;
	public int idade;
	
	public double calcMedia(double somaAlt, double n) {
		return somaAlt / n;
	}
	
	public double porcent(int somaIdade, int nmr) {
		 return ((double) somaIdade / nmr) * 100;
	}

	public Pessoas(String nome, double altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}
	
	
	
	
	
	
	
	
   

}

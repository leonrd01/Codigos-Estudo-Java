package estudos005;

public class Hospedagem {
	String nome;
	String email;
	int quarto;
	
	public Hospedagem(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public void ListaQuartos() {
		System.out.println("----------------------");
		System.out.println("Quarto #" + (quarto+1));
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("----------------------");
	}
	
	

}

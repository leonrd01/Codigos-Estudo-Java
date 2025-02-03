package estudos003;

public class Conta {
	
	public String nome;
	public int conta;
	private double saldo;
	
	

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldoDep(double saldo) {
		this.saldo += saldo;
	}
	
	public void setSaldoSac(double saldo) {
		this.saldo -= saldo + 5;
	}
	
	public void mostrarConta(){
		System.out.println("Conta: " + conta);
		System.out.println("Nome titula: " + nome);
		System.out.println("Saldo: " + saldo);
	}
	
	
	
	

}

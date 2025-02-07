package model.entites;

public class Conta {
	private int contaB;
	private String titular;
	private double saldo;
	private double limiteSaque;
	
	public Conta(int contaB, String titular, double saldo, double limiteSaque) {
		this.contaB = contaB;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public int getConta() {
		return contaB;
	}

	public void setConta(int conta) {
		this.contaB = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double saque) {
		if(saque > limiteSaque) {
			throw new IllegalArgumentException("Saque não autorizado, valor de saque excede limite de saque!!");
		}
		if(saque > saldo) {
			throw new IllegalArgumentException("Saque não autorizado, valor de saque excede saldo em conta!!");
		}	
		this.saldo -= saque;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Saldo: R$" + saldo;
	}
	
	
	

}

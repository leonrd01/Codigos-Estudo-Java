package estudos012;

import java.util.Scanner;

import model.entites.Conta;

public class programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		try {
			System.out.println(" *Conta Bancária*");
			System.out.println("");
			System.out.print("Número da Conta: ");
			int contaB = ler.nextInt();
			System.out.print("Titular: ");
			String titular = ler.next();
			System.out.print("Saldo inicial: ");
			double saldo = ler.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = ler.nextDouble();
			
			Conta conta = new Conta(contaB,titular,saldo,limiteSaque);
			
			System.out.println(conta);
			
			System.out.println("");
			System.out.print("Quanto deseja sacar? ");
			conta.sacar(ler.nextDouble());
			
			System.out.println("");
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("");
			System.out.println(conta);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Erro inesperado ao criar conta!");
		}
		
		

	}

}

package estudos003;

import java.util.Scanner;

public class estudos003 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Conta conta = new Conta();
		double attSaldo;
		conta.conta = 255;
		
	    System.out.println("preencha os dados abaixo para criar sua conta:");
		System.out.println("");
		System.out.println("");
		System.out.print("Nome: ");
		conta.nome = ler.next();
		
		System.out.println("");
		System.out.println("Deseja realizar o primeiro deposito? [S/N] ");
		String opc = ler.next();
		
		switch(opc) {
		case "S":
			System.out.print("Digite o valor que deseja depositar: ");
			attSaldo = ler.nextDouble();
			conta.setSaldoDep(attSaldo);
		break;	
		}
		
		System.out.println("");
		System.out.println("");
		
		conta.mostrarConta();
		
		System.out.println("");
		System.out.print("Digite o valor que deseja sacar: ");
		attSaldo = ler.nextDouble();
		conta.setSaldoSac(attSaldo);
		
		System.out.println("");
		System.out.println("");
		
		conta.mostrarConta();

	}

}

package estudos010;

import java.util.Scanner;

public class estudos010 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double totalImpostos = 0;
		
		
		System.out.print("Quantos contribuentes irá cadastrar? ");
		int qnt = ler.nextInt();
		Contribuente[] contribuente = new Contribuente[qnt];
		
		ler.nextLine();
		for(int i=0;i<qnt;i++) {
			System.out.println("");
			System.out.print("O contribuente é Pessoa Fisíca[F] ou Pessoa Juridica[J] ?");
			String opc = ler.next();
			System.out.println("");
			if(opc.equals("f")) {
				System.out.println("------------------------------");
				System.out.println("#"+(i+1)+":");
				System.out.println("");
				System.out.print("NOME:");
				String nome = ler.next();
				System.out.print("RENDA ANUAL: ");
				double renda = ler.nextDouble();
				System.out.print("GASTOS COM SAÚDE: ");
				double gastos = ler.nextDouble();
				System.out.println("------------------------------");
				contribuente[i] = new PessoaFisica(nome,renda,gastos);	
				((PessoaFisica) contribuente[i]).tax();
				totalImpostos += contribuente[i].getImp();
			}else {
				System.out.println("------------------------------");
				System.out.println("#"+(i+1)+":");
				System.out.println("");   
				System.out.print("NOME:");
				String nome = ler.next();
				System.out.print("RENDA ANUAL: ");
				double renda = ler.nextDouble();
				System.out.print("NÚMERO DE FUNCIONARIOS: ");
				int func = ler.nextInt();
				System.out.println("------------------------------");
				contribuente[i] = new PessoaJuridica(nome,renda,func);
				((PessoaJuridica) contribuente[i]).tax();
				totalImpostos += contribuente[i].getImp();
			}	
		}
		
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("Contribuentes: ");
		System.out.println("");	
		for(int i=0;i<qnt;i++) {
			System.out.printf("%s: R$%.2f%n", contribuente[i].nome, contribuente[i].getImp());
			System.out.println("");	
		}	
		System.out.printf("Total de Impostos Arrecadados: R$%.2f%n", totalImpostos);
		System.out.println("----------------------------");	
		
		
		
     
	
		
		
		
		
		
		
	}

}

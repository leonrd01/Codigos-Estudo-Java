package estudos004;

import java.util.Scanner;

public class estudos004 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double somaAlt = 0;
		int somaIdade= 0;
		
		
		System.out.println("Preencha as informações abaixo: ");
		System.out.println("");
		System.out.println("");
		System.out.print("Quantas pessoas vai adicionar?");
		int n = ler.nextInt();
		Pessoas[] pessoa = new Pessoas[n];
	
		for(int i=0;i<pessoa.length;i++){
			System.out.println("");
			System.out.println("- Pessoa " + (i+1));
			System.out.println("");
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.print("Idade: ");
		    int idade = ler.nextInt();
		    if(idade<16) {
		    	somaIdade = somaIdade+1;
		    }
		    System.out.print("Altura ");
	        double altura = ler.nextDouble();
	        pessoa[i] = new Pessoas(nome, altura, idade);
	        somaAlt += altura;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for(int i=0;i<pessoa.length;i++){
			System.out.println("");
			System.out.println("- Pessoa " + (i+1));
			System.out.println("");
			System.out.println("Nome: " + pessoa[i].nome);
			System.out.println("Idade: " + pessoa[i].idade);
		    System.out.println("Altura " + pessoa[i].altura);
		}
		System.out.println("");
		System.out.println("Altura média: " + pessoa[0].calcMedia(somaAlt, n));
		System.out.println("Pessoas com menos de 16 anos: " + pessoa[0].porcent(somaIdade, n) + "%");
		for(int i=0;i<pessoa.length;i++) {
			if(pessoa[i].idade < 16) {
				System.out.println(pessoa[i].nome);
			}
		}
		
		
		   
	}
}

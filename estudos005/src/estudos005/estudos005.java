package estudos005;

import java.util.Scanner;

public class estudos005 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Hospedagem[] hospedagem = new Hospedagem[9];
		String opc = "S";
		int rep = 0;
		
		do{
			try {
				System.out.println("");
				System.out.print("Quantas pessoas deseja hospedar?");
		        int h = ler.nextInt();
		        if(h <= 10) {
			        System.out.println("");
			        System.out.println("");
			        System.out.println("Preencha as informações abaixo:");
			        for(int i=0;i<h;i++) {	        
				        System.out.println("");
				        System.out.println("Hospedagem # " + (i+1));
				        System.out.println("");
				        
				        System.out.print("Nome: ");
				    	String nome = ler.next();
				    	System.out.print("E-mail: ");
				    	String email = ler.next();
				    	do {
					    	System.out.print("Número do Quarto: ");
				        	int quarto = ler.nextInt(); 
				        	quarto -= 1;
					        for(int x=0;x<hospedagem.length;x++){
					        	if(quarto == x){
					        		if(hospedagem[x] == null) {
					        			hospedagem[x] = new Hospedagem(nome, email, quarto);
					        			rep = 1;
					        		}else {
					        			System.out.println("");
					        			System.out.println("*Ops... Quarto já ocupado*");
					        			System.out.println("");
					        			System.out.println("Escolha outro quarto");
					        			System.out.println("");
					        			rep = 0;
					        		}				        	   
					        	}
					        }
				    	}while(rep == 0);
			        }
			        System.out.println("");
			        System.out.println("");
			        System.out.println("Quartos Vagos: ");
			    	System.out.println("");
			        for(int i=0;i<9;i++) {
			        	if(hospedagem[i] != null) {
			        		hospedagem[i].ListaQuartos();
			        		System.out.println("");
			        	}	        	
			        }
			        System.out.println("");
			        System.out.println("Deseja fazer mais hospedagens? [S/N]");
			        opc = ler.next();
		        }else {
		        	System.out.println("");
		        	System.out.println("*Ops... Quantidade de hospedagem ultrapassa limite de quartos disponivéis*");
		        	System.out.println("");
		        	System.out.println("Digite uma Quantidade menor ou igual a 10");
		        	System.out.println("");
		        	continue;
		        }
			 }catch (Exception e) {
				 System.out.println("");
				 System.out.println("***************** ERRO *******************");
				 System.out.println("Refaça a operação e digite um valor válido");
				 System.out.println("******************************************");
				 ler.nextLine();
				 continue;
			 }
		 }while(opc.equals("S"));	
	}

}

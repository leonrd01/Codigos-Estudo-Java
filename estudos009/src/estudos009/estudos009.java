package estudos009;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class estudos009 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
				
		System.out.print("Olá, Quantos produtos deseja comprar? ");
		int qnt = ler.nextInt();
		Produto[] produto = new Produto[qnt];
		System.out.println("");
		
		
		for(int i=0;i<qnt;i++) {
			System.out.println("");
			System.out.println("");
			System.out.print("O produto é nacional(n), importado(i) ou usado(u)? ");
		    String opc = ler.next();
		    System.out.println("");
		    switch(opc) {
		    
		          case "n":
		        	  produto[i] = new Produto();
		        	  System.out.print("Nome: ");
		        	  produto[i].nome = ler.next();
		        	  System.out.println("preço: ");
		        	  double preco = ler.nextDouble();
		        	  produto[i].setPreco(preco);  
		        	  System.out.println("");
	        	      System.out.println("");
	        	      System.out.println("Etiquetas de Preço:");
	        	      System.out.println("");
	        	      System.out.println("Nome do Produto: " + produto[i].nome);
	        	      System.out.println("Preço: R$" + produto[i].getPreco());
		          break;
		          
			            case "i":			        	    
			        	    produto[i] = new ProdutoImportado();
			        	    System.out.print("Nome: ");
			        	    produto[i].nome = ler.next();
			        	    System.out.print("preço: ");
			        	    preco = ler.nextDouble();
			        	    produto[i].setPreco(preco); 
			        	    System.out.print("Taxa: ");
			        	    ((ProdutoImportado) produto[i]).taxa = ler.nextDouble();			       
			        	    ((ProdutoImportado) produto[i]).taxar(((ProdutoImportado) produto[i]).taxa);
			        	    System.out.println("");
			        	    System.out.println("");
			        	    System.out.println("Etiquetas de Preço:");
			        	    System.out.println("");
			        	    System.out.println("Nome do Produto: " + produto[i].nome);
			        	    System.out.println("Preço: R$" + produto[i].getPreco());
			        	    System.out.println("Taxa: R$" + ((ProdutoImportado) produto[i]).taxa);
			            break;
			            
			                  case "u":			                	 
			                	   produto[i] = new ProdutoUsado();
					        	   System.out.print("Nome: ");
					        	   produto[i].nome = ler.next();
					        	   System.out.print("preço: ");
					        	   preco = ler.nextDouble();
					        	   produto[i].setPreco(preco); 
					        	   System.out.print("Data de Fabricação: ");
					        	   String data = ler.next();
					        	   ((ProdutoUsado) produto[i]).dataF = LocalDate.parse(data, fmt1);					        	   
					        	   System.out.println("");
					        	   System.out.println("");
					        	   System.out.println("Etiquetas de Preço:");
					        	   System.out.println("");
					        	   System.out.println("Nome do Produto: " + produto[i].nome);
					        	   System.out.println("Preço: R$" + produto[i].getPreco());
					        	   System.out.println("Data de Fabricação: " + ((ProdutoUsado) produto[i]).dataF.format(fmt1));
			                  break;	  
		    }
		}
		
		

	}

}

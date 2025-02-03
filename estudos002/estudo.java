package estudos002;

import java.util.Scanner;

public class estudo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Preencha as informações abaixo:");
		System.out.println("");
		System.out.println("");
		System.out.print("Nome: ");
		produto.nome = ler.next();
		System.out.print("Preço: ");
		produto.preco = ler.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = ler.nextInt();
		
		System.out.println("");
		System.out.println("");
		
		produto.mostrarProduto();
		
		System.out.println("");
		System.out.println("Deseja adicionar ou remover quantidade? Adicionar[A] / Remover[R]");
		String opc = ler.next();
		
		System.out.println("");
		System.out.print("Digite a quantidade que deseja adicionar: ");
		int add = ler.nextInt();
		
		switch(opc) {
		case "A":		
			produto.addProduto(add);
            System.out.println("Operação realizada com sucesso!!");
		break;
		case "B":
			produto.removProduto(add);
			System.out.println("Operação realizada com sucesso!!");
		}
		
		produto.mostrarProduto();
		
		
		
		
		
		
		
		
		
		
		
	}

}

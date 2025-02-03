package estudos008;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class estudos008 {

	public static void main(String[] args) {
		
		cliente clnt = new cliente();
		Scanner ler = new Scanner(System.in);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		int pedidos;
		double precoTot = 0;
		
		
		System.out.println("Olá, preencha suas informações abaixo: ");
		System.out.println("");
		System.out.println("");
		System.out.print("Nome: ");
		clnt.nome = ler.next();
		ler.nextLine();
		System.out.print("Email: ");
		clnt.email = ler.next();
		System.out.print("Data de nascimento: ");
		ler.nextLine();
		String data = ler.nextLine();
		clnt.datas(data);
		ler.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.print("Quantos Pedidos Deseja Fazer: ");
		pedidos = ler.nextInt();
		Produtos[] produto = new Produtos[pedidos];
		System.out.println("");
		
		for(int i=0;i<pedidos;i++) {
			produto[i] = new Produtos();
			System.out.print("Nome do Produto: ");
			produto[i].nomeP = ler.next();
			System.out.print("Preço: ");
			double preco = ler.nextDouble();
			produto[i].setPreco(preco);
			System.out.print("Quantidade: ");
			produto[i].qnt = ler.nextInt();
			precoTot += (preco*produto[i].qnt);
		}
		
		System.out.println("");
		System.out.println("");
		
		LocalDateTime atual = LocalDateTime.now();
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println("");
		System.out.println("Data do Pedido: " + atual.format(fmt2));
		System.out.println("Status do Pedido: " + Status.Processando);
		System.out.println("Cliente: " + clnt.nome + " (" + clnt.dataNasci + ") " + "- " + clnt.email);
		System.out.println("");
		System.out.println("ITENS DO PEDIDO:");
		System.out.println("");
		for(int i=0;i<pedidos;i++) {
			System.out.println(produto[i].nomeP + ", " + produto[i].getPreco() + ", Quantidade: " + produto[i].qnt + ", Subtotal: " + produto[i].subTot());
		}
		System.out.println("Preço Total: " + precoTot);
		
		

		
	}

}

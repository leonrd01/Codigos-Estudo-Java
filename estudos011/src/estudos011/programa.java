package estudos011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do Quarto: ");
			int quarto = ler.nextInt();
			System.out.print("Insira a data de Check-in (dd/MM/yyyy): ");
			Date checkIn = fmt1.parse(ler.next());
			System.out.print("Insira a data de Check-out (dd/MM/yyyy): ");
			Date checkOut = fmt1.parse(ler.next());	
			
			Reserva reserva = new Reserva(quarto, checkIn, checkOut);
			
			System.out.println("");
			System.out.println("RESERVA: " + reserva);
			
			System.out.println("");
			System.out.println("Atualize sua Reserva: ");
			System.out.println("");
			System.out.print("Insira a nova data de Check-in (dd/MM/yyyy): ");
			checkIn = fmt1.parse(ler.next());
			System.out.print("Insira a data de Check-out (dd/MM/yyyy): ");
			checkOut = fmt1.parse(ler.next());
			reserva.atualizarData(checkIn, checkOut);
			System.out.println("");
			System.out.println("RESERVA: " + reserva);
		}
		catch(ParseException e) {
			System.out.println("Formato da Data Inválida!!");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Erro na Reserva: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Erro ao Digitar o número do quarto!! Digite um Número!!");
		}
		
		
		
		
		

	}

}

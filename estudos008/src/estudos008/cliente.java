package estudos008;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class cliente {
	public String nome;
	public String email;
	public LocalDate dataNasci;
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public void datas(String data) {
		dataNasci = LocalDate.parse(data, fmt1);
	}
	
	
	

}

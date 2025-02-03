package estudos006;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class estudos006 {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-01-07");
		LocalDateTime d05 = LocalDateTime.parse("2025-01-07T11:12:12");
		Instant d06 = Instant.parse("2025-01-07T11:26:00Z");
		Instant d07 = Instant.parse("2025-01-07T11:23:00-03:00");
		
		
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		
		
		
		
	}

}

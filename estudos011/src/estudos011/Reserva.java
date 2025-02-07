package estudos011;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	
	private int quarto;
	private Date checkIn;
	private Date checkOut;
	
	private SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(int quarto, Date checkIn, Date checkOut) {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new IllegalArgumentException("Datas Inválidas!! Coloque uma Data posterior a hoje!!");
		}
		if(checkOut.before(checkIn)) {
			throw new IllegalArgumentException("Datas Inválidas!! O check-out precisa ser posterior ao check-in!!"); 
		}
		this.quarto = quarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long comparar() {
		long diff = checkOut.getTime() - checkIn.getTime();
		 return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void atualizarData(Date checkIn, Date checkOut) {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new IllegalArgumentException("Datas Inválidas!! Coloque uma Data posterior a hoje!!");
		}
		if(checkOut.before(checkIn)) {
			throw new IllegalArgumentException("Datas Inválidas!! O check-out precisa ser posterior ao check-in!!"); 
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	

	@Override
	public String toString() {
		return "Quarto: " + quarto + ", Check-In: " + fmt1.format(checkIn) + ", Check-out: " + fmt1.format(checkOut) + ", Duração restante: " + comparar();
	}
	
	

}

package entites;

import java.util.Date;

import estudos007.Status_Pedido;

public class Pedido {
	private int id;
	private Date momento;
	private Status_Pedido status;
	
	public Pedido( ) {
		
	}

	public Pedido(int id, Date momento, Status_Pedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Status_Pedido getStatus() {
		return status;
	}

	public void setStatus(Status_Pedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	
	
	
	

}

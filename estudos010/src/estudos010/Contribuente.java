package estudos010;

public abstract class Contribuente {
	public String nome;
	private double rendaA;
	protected double Imp = 0;
	
	
	public Contribuente() {
	}
	
	public Contribuente(String nome, double rendaA) {
		this.nome = nome;
		this.rendaA = rendaA;
	}

	public double getRendaA() {
		return rendaA;
	}
	
	public void setRendaA(double rendaA) {
		this.rendaA = rendaA;
	}
	
	public abstract void tax();

	public double getImp() {
		return Imp;
	}

	public void setImp(double imp) {
		this.Imp += imp;
	}
	
	

}

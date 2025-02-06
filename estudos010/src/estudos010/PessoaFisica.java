package estudos010;

public class PessoaFisica extends Contribuente {
	
	private double gastoS;
	public double calc = 0;
	

	public PessoaFisica(String nome, double rendaA, double gastoS) {
		super(nome, rendaA);
		this.gastoS = gastoS;
	}


	@Override
	public void tax() {
		
		if(this.getRendaA() < 20000) {
			this.Imp = (15.0/100)*this.getRendaA() - (50.0/100)*gastoS;
		}else {
			this.Imp = (25.0/100)*this.getRendaA() - (50.0/100)*gastoS;
		}
		
		
			
	}
	
	
	

}

package estudos010;

public class PessoaJuridica extends Contribuente {
	public int qntF;
	public double calc = 0;
	
	
	public PessoaJuridica(String nome, double rendaA, int qntF) {
		super(nome, rendaA);
		this.qntF = qntF;
	}

	@Override
	public void tax() {
		
		if(qntF < 10) {
			this.Imp = (16.0/100)*this.getRendaA();
		}else {
			this.Imp = (14.0/100)*this.getRendaA();
		}
		
	}
	

}

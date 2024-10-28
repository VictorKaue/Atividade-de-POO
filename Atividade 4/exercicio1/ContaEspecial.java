package exercicio1;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public ContaEspecial(String nome, int NumeroDaConta, double saldo, double limite) {
		super(nome, NumeroDaConta, saldo);
		if(limite > 0) {
			this.limite = limite * -1;
		} else {
			this.limite = limite;
		}
	}
	
	@Override
	public void sacar(double retirar) {
		if((this.saldo-retirar) >= this.limite) {
			this.saldo -= retirar;
		} else {
			System.err.println("Valor fora do limite");
		}
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		if(limite > 0) {
			this.limite = limite * -1;
		} else {
			this.limite = limite;
		}
	}	
}

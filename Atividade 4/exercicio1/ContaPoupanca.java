package exercicio1;

public class ContaPoupanca extends ContaBancaria{
	private int diaDeRendimento;

	public ContaPoupanca(String nome, int NumeroDaConta, double saldo, int diaDeRendimento) {
		super(nome, NumeroDaConta, saldo);
		this.diaDeRendimento = diaDeRendimento;
	}

	public void calcularNovoSaldo(double taxa) {
		this.saldo += this.saldo*taxa;
	}
	
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}		
}

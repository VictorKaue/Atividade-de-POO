package exercicio1;

public class ContaBancaria {
	protected String nomeCliente;
	protected int numeroDaConta;
	protected double saldo;
	
	ContaBancaria(String nome, int NumeroDaConta, double saldo){
		try {
			if(nome.length() <= 2 || nome.isBlank()) {
				throw new IllegalArgumentException("Nome inválido!");
			}
			this.nomeCliente = nome;
			if(NumeroDaConta <= 0) {			
				throw new IllegalArgumentException("Número da conta inválido!");
			}			
			this.numeroDaConta = NumeroDaConta;
			if(saldo < 0) {
				throw new IllegalArgumentException("Saldo inválido!");
			}
			this.saldo = saldo;			
		} catch(IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	ContaBancaria(String nome, int NumeroDaConta){
		try {
			if(nome.length() <= 2 || nome.isBlank()) {
				throw new IllegalArgumentException("Nome inválido!");
			}
			this.nomeCliente = nome;			
			if(NumeroDaConta <= 0) {			
				throw new IllegalArgumentException("Número da conta inválido");
			}			
			this.numeroDaConta = NumeroDaConta;
		} catch(IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
		this.saldo = 0;
	}
		
	public void sacar(double retirar) {
			if(this.saldo >= retirar){
				this.saldo -= retirar;
			} else {
				System.err.println("Saldo insuficiente!");
			}
	}
	
	public void depositar(double deposito) {
		if(deposito > 0) {
			this.saldo += deposito;
		} else {
			System.err.println("Saldo inválido");
		}
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		if(numeroDaConta > 0) {
			this.numeroDaConta = numeroDaConta;
		} else {
			System.err.println("Número da conta inválido");
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo > 0) {
			this.saldo = saldo;
		} else {
			System.err.println("Valor inválido para o saldo");
		}
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + nomeCliente +
					"\nNúmero da Conta: " + numeroDaConta +
					"\nSaldo: " + saldo;
	}
}

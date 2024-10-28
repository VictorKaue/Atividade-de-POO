package exercicio3;

public class Suite implements Acomodacao, ServicoAdicional {
	private int quantidadePessoas;
	private int dias;
	
	public Suite(int quantidade) {
		this.quantidadePessoas = quantidade;
		this.dias = 0;
	}
	
	public double calcularDiaria() {
		return dias * 350;
	}

	public double calcularServico() {
		return dias * (30+(quantidadePessoas*20));
	}
	
	public void exibirDetalhes(int dias) {
		System.out.println("Quantidade de dias: " + dias);
		System.out.println("Preço total: " + dias * 350 + calcularServico());
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		if(quantidadePessoas > 0) {
			this.quantidadePessoas = quantidadePessoas;
		} else {
			System.err.println("Número de pessoas inválidos!");
		}
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		if(dias > 0) {
			this.dias = dias;
		} else {
			System.err.println("Número de dias inválidos!");
		}	
	}	
}

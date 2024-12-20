package exercicio2;

public class Caminhao extends Veiculos{
	private double precoOriginal;	
	private double ipva;
	
	public Caminhao(String placa, String marca, String modelo, int anoDeFabricacao, double precoOriginal) {
		super(placa, marca, modelo, anoDeFabricacao);
		this.precoOriginal = precoOriginal;
		this.ipva = 0.0;
	}

	public double valorEstimado() {
		return precoOriginal - (2024 - anoDeFabricacao) * 2000;
	}
	
	public void calcularIPVA() {
		ipva = valorEstimado() * 15 / 1000;
	}
	public void exibirDetalhes() {
		System.out.println("Caminhão: ");
		System.out.println("Placa: " + placa);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de fabricação: " + anoDeFabricacao);
		System.out.println("Preço original: " + precoOriginal);
		System.out.println("Valor estimado: " + valorEstimado());
	}

	public double getPrecoOriginal() {
		return precoOriginal;
	}
	
	public void setPrecoOriginal(double precoOriginal) {
		this.precoOriginal = precoOriginal;
	}
	
	public double getIpva() {
		return ipva;
	}
}

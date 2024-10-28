package exercicio2;

abstract public class Veiculos {
	protected String placa;
	protected String marca;
	protected String modelo;
	protected int anoDeFabricacao;
	
	public Veiculos(String placa, String marca, String modelo, int anoDeFabricacao) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
	}
	
	abstract public void calcularIPVA();
	abstract public void exibirDetalhes();
	
	
}

package exercicio3;

public class Principal {
	public static void main(String[] args) {
		QuartoSimples simples = new QuartoSimples(4);
		QuartoDuplo duplo = new QuartoDuplo(3);
		Suite suite = new Suite(2);
		simples.exibirDetalhes(2);
		duplo.exibirDetalhes(1);
		suite.exibirDetalhes(3);
	}
}

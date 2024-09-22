package restaurante;

import java.util.ArrayList;

public class Pedido{
	private int numeroPedido;
    private String nomeCliente;
	private ArrayList<Prato> prato;
	
    public Pedido() {
        this.numeroPedido = 0;
        this.nomeCliente = "";
        this.prato = new ArrayList<>();
    }

    public Pedido(int numeroPedido, String nomeCliente, Prato[] prato) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.prato = new ArrayList<Prato>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Prato getPratos(int posicao) {
        return prato.get(posicao);
    }

    public void setPratos(Prato prato) {
        this.prato.add(prato);
    }

    //Metódo Para Validar se o Nome é vazio
    public String validaNome(String nome) {
        if(nome.length() == 0) {
            System.out.println("Nome não informado!");
            return "";
        } else {
            return nome;
        }
    }
    public void exibirPedido() {
    	System.out.println("Número do pedido: " + numeroPedido);
    	System.out.println("Nome do Cliente: " + nomeCliente);
    	System.out.println("Pratos escolhidos: ");
    	for (int i = 0;i < prato.size() ;i++) {
    		System.out.println(prato.get(i).getNome());
    		System.out.println(prato.get(i).getPreco());
    		System.out.println(prato.get(i).getCategoria());	
    	}
    }
    
    public float getPrecoFinal() {
    	float preco_total = 0;
    	for (int i = 0;i < prato.size() ;i++) {
    		preco_total += prato.get(i).getPreco();
    	}
    	return preco_total;
    }
}

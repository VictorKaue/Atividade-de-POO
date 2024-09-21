package restaurante;

public class Prato {
    private String nome;
    private double preco;
    private String categoria;

    public Prato() {
        this.nome = "";
        this.preco = 0.0;
        this.categoria = "";
    }

    public Prato(String nome, double preco, String categoria) {
        this.nome = nome;
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
            this.preco = 0.0;
        }
        this.categoria = categoria;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
            this.preco = 0.0;
        }
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

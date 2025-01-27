package model;

public class Produto {
    private String nome;
    private float preco;
    private int quantidadeEmEstoque;
    private int qtdSolic;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getQtdSolic() {
        return qtdSolic;
    }

    public void setQtdSolic(int qtdSolic) {
        this.qtdSolic = qtdSolic;
    }
}
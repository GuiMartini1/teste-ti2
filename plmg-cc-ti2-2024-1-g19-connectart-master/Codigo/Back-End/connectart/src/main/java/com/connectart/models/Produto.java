package com.connectart.models;

public class Produto {
    private int produtoId;  // Atributo correspondente a produto_id na tabela
    private String produtoNome;  // Atributo correspondente a produto_nome na tabela
    private double produtoPreco;  // Atributo correspondente a produto_preco na tabela (DECIMAL)
    private String produtoDescricao;  // Atributo correspondente a produto_descricao na tabela

    // Construtor padrão (sem argumentos)
    public Produto() {
        this.produtoId = -1;
        this.produtoNome = "";
        this.produtoPreco = 0.0;
        this.produtoDescricao = "";
    }

    // Construtor com argumentos
    public Produto(int produtoId, String produtoNome, double produtoPreco, String produtoDescricao) {
        this.produtoId = produtoId;
        this.produtoNome = produtoNome;
        this.produtoPreco = produtoPreco;
        this.produtoDescricao = produtoDescricao;
    }

    // Métodos getter e setter para os atributos

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public double getProdutoPreco() {
        return produtoPreco;
    }

    public void setProdutoPreco(double produtoPreco) {
        this.produtoPreco = produtoPreco;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }

    public void setProdutoDescricao(String produtoDescricao) {
        this.produtoDescricao = produtoDescricao;
    }

    // Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Produto [produtoId=" + produtoId + ", produtoNome=" + produtoNome + ", produtoPreco=" + produtoPreco + ", produtoDescricao=" + produtoDescricao + "]";
    }
}

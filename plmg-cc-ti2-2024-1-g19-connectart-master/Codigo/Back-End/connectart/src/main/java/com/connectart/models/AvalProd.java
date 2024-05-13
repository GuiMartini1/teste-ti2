package com.connectart.models;

public class AvalProd {
    private int avalProdId;  // Atributo correspondente a aval_prod_id na tabela
    private int avalProdPontuacao;  // Atributo correspondente a aval_prod_pontuacao na tabela
    private String avalProdComentario;  // Atributo correspondente a aval_prod_comentario na tabela
    private int avalProdCliente;  // Atributo correspondente a aval_prod_cliente na tabela
    private int avalProdProduto;  // Atributo correspondente a aval_prod_produto na tabela

    // Construtor padrão (sem argumentos)
    public AvalProd() {
        this.avalProdId = -1;
        this.avalProdPontuacao = 0;
        this.avalProdComentario = "";
        this.avalProdCliente = -1;
        this.avalProdProduto = -1;
    }

    // Construtor com argumentos
    public AvalProd(int avalProdId, int avalProdPontuacao, String avalProdComentario, int avalProdCliente, int avalProdProduto) {
        this.avalProdId = avalProdId;
        this.avalProdPontuacao = avalProdPontuacao;
        this.avalProdComentario = avalProdComentario;
        this.avalProdCliente = avalProdCliente;
        this.avalProdProduto = avalProdProduto;
    }

    // Métodos getter e setter para os atributos

    public int getAvalProdId() {
        return avalProdId;
    }

    public void setAvalProdId(int avalProdId) {
        this.avalProdId = avalProdId;
    }

    public int getAvalProdPontuacao() {
        return avalProdPontuacao;
    }

    public void setAvalProdPontuacao(int avalProdPontuacao) {
        this.avalProdPontuacao = avalProdPontuacao;
    }

    public String getAvalProdComentario() {
        return avalProdComentario;
    }

    public void setAvalProdComentario(String avalProdComentario) {
        this.avalProdComentario = avalProdComentario;
    }

    public int getAvalProdCliente() {
        return avalProdCliente;
    }

    public void setAvalProdCliente(int avalProdCliente) {
        this.avalProdCliente = avalProdCliente;
    }

    public int getAvalProdProduto() {
        return avalProdProduto;
    }

    public void setAvalProdProduto(int avalProdProduto) {
        this.avalProdProduto = avalProdProduto;
    }

    // Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "AvalProd [avalProdId=" + avalProdId + ", avalProdPontuacao=" + avalProdPontuacao + ", avalProdComentario=" + avalProdComentario + ", avalProdCliente=" + avalProdCliente + ", avalProdProduto=" + avalProdProduto + "]";
    }
}

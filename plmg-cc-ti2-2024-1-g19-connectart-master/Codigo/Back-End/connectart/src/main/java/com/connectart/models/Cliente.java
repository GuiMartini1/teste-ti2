package com.connectart.models;
public class Cliente {
    private int clienteId;  // Atributo correspondente a cliente_id na tabela
    private String clienteNome;  // Atributo correspondente a cliente_nome na tabela
    private String clienteEmail;  // Atributo correspondente a cliente_email na tabela
    private String clienteSenha;  // Atributo correspondente a cliente_senha na tabela
    private int clienteCompras;  // Atributo correspondente a cliente_compras na tabela
    private String clienteTelefone;  // Atributo correspondente a cliente_telefone na tabela

    // Construtor padrão (sem argumentos)
    public Cliente() {
        this.clienteId = -1;
        this.clienteNome = "";
        this.clienteEmail = "";
        this.clienteSenha = "";
        this.clienteCompras = 0;
        this.clienteTelefone = "";
    }

    // Construtor com argumentos
    public Cliente(int clienteId, String clienteNome, String clienteEmail, String clienteSenha, int clienteCompras, String clienteTelefone) {
        this.clienteId = clienteId;
        this.clienteNome = clienteNome;
        this.clienteEmail = clienteEmail;
        this.clienteSenha = clienteSenha;
        this.clienteCompras = clienteCompras;
        this.clienteTelefone = clienteTelefone;
    }

    // Métodos getter e setter para os atributos

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteSenha() {
        return clienteSenha;
    }

    public void setClienteSenha(String clienteSenha) {
        this.clienteSenha = clienteSenha;
    }

    public int getClienteCompras() {
        return clienteCompras;
    }

    public void setClienteCompras(int clienteCompras) {
        this.clienteCompras = clienteCompras;
    }

    public String getClienteTelefone() {
        return clienteTelefone;
    }

    public void setClienteTelefone(String clienteTelefone) {
        this.clienteTelefone = clienteTelefone;
    }

    // Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Cliente [clienteId=" + clienteId + ", clienteNome=" + clienteNome + ", clienteEmail=" + clienteEmail
                + ", clienteSenha=" + clienteSenha + ", clienteCompras=" + clienteCompras + ", clienteTelefone=" + clienteTelefone + "]";
    }
}

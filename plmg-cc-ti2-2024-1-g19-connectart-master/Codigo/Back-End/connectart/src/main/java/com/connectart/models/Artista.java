package com.connectart.models;

public class Artista {
    private int artistaId;  // Atributo correspondente a artista_id na tabela
    private String artistaNome;  // Atributo correspondente a artista_nome na tabela
    private String artistaEmail;  // Atributo correspondente a artista_email na tabela
    private String artistaSenha;  // Atributo correspondente a artista_senha na tabela
    private String artistaEndereco;  // Atributo correspondente a artista_endereco na tabela
    private String artistaDescricao;  // Atributo correspondente a artista_descricao na tabela
    private String artistaTelefone;  // Atributo correspondente a artista_telefone na tabela

    // Construtor padrão (sem argumentos)
    public Artista() {
        this.artistaId = -1;
        this.artistaNome = "";
        this.artistaEmail = "";
        this.artistaSenha = "";
        this.artistaEndereco = "";
        this.artistaDescricao = "";
        this.artistaTelefone = "";
    }

    // Construtor com argumentos
    public Artista(int artistaId, String artistaNome, String artistaEmail, String artistaSenha, String artistaEndereco, String artistaDescricao, String artistaTelefone) {
        this.artistaId = artistaId;
        this.artistaNome = artistaNome;
        this.artistaEmail = artistaEmail;
        this.artistaSenha = artistaSenha;
        this.artistaEndereco = artistaEndereco;
        this.artistaDescricao = artistaDescricao;
        this.artistaTelefone = artistaTelefone;
    }

    // Métodos getter e setter para os atributos

    public int getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(int artistaId) {
        this.artistaId = artistaId;
    }

    public String getArtistaNome() {
        return artistaNome;
    }

    public void setArtistaNome(String artistaNome) {
        this.artistaNome = artistaNome;
    }

    public String getArtistaEmail() {
        return artistaEmail;
    }

    public void setArtistaEmail(String artistaEmail) {
        this.artistaEmail = artistaEmail;
    }

    public String getArtistaSenha() {
        return artistaSenha;
    }

    public void setArtistaSenha(String artistaSenha) {
        this.artistaSenha = artistaSenha;
    }

    public String getArtistaEndereco() {
        return artistaEndereco;
    }

    public void setArtistaEndereco(String artistaEndereco) {
        this.artistaEndereco = artistaEndereco;
    }

    public String getArtistaDescricao() {
        return artistaDescricao;
    }

    public void setArtistaDescricao(String artistaDescricao) {
        this.artistaDescricao = artistaDescricao;
    }

    public String getArtistaTelefone() {
        return artistaTelefone;
    }

    public void setArtistaTelefone(String artistaTelefone) {
        this.artistaTelefone = artistaTelefone;
    }

    // Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Artista [artistaId=" + artistaId + ", artistaNome=" + artistaNome + ", artistaEmail=" + artistaEmail + ", artistaSenha=" + artistaSenha + ", artistaEndereco=" + artistaEndereco + ", artistaDescricao=" + artistaDescricao + ", artistaTelefone=" + artistaTelefone + "]";
    }
}

package com.connectart.dao;

import java.sql.*;

import com.connectart.models.Artista;

public class ArtistaDAO extends DAO{
    

    public ArtistaDAO() {
        super();
        conectar();
    }

    public boolean inserirArtista(Artista artista) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO connectart.artista (artista_id, artista_nome, artista_email, artista_senha, artista_endereco, artista_descricao, artista_telefone) "
                             + "VALUES (" + artista.getArtistaId() + ", '" + artista.getArtistaNome() + "', '" + artista.getArtistaEmail() + "', '" + artista.getArtistaSenha() + "', '" + artista.getArtistaEndereco() + "', '" + artista.getArtistaDescricao() + "', '" + artista.getArtistaTelefone() + "');");
            st.close();
            status = true;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return status;
    }

    public boolean atualizarArtista(Artista artista) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            String sql = "UPDATE connectart.artista SET artista_nome = '" + artista.getArtistaNome() + "', artista_email = '" + artista.getArtistaEmail() + "', artista_senha = '" + artista.getArtistaSenha() + "', artista_endereco = '" + artista.getArtistaEndereco() + "', artista_descricao = '" + artista.getArtistaDescricao() + "', artista_telefone = '" + artista.getArtistaTelefone() + "' WHERE artista_id = " + artista.getArtistaId();
            st.executeUpdate(sql);
            st.close();
            status = true;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return status;
    }

    public boolean excluirArtista(int artistaId) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("DELETE FROM connectart.artista WHERE artista_id = " + artistaId);
            st.close();
            status = true;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return status;
    }

    public Artista[] getArtistas() {
        Artista[] artistas = null;

        try {
            Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM connectart.artista");

            if (rs.next()) {
                rs.last();
                artistas = new Artista[rs.getRow()];
                rs.beforeFirst();

                for (int i = 0; rs.next(); i++) {
                    artistas[i] = new Artista(rs.getInt("artista_id"), rs.getString("artista_nome"), rs.getString("artista_email"), rs.getString("artista_senha"), rs.getString("artista_endereco"), rs.getString("artista_descricao"), rs.getString("artista_telefone"));
                }
            }
            st.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return artistas;
    }
}
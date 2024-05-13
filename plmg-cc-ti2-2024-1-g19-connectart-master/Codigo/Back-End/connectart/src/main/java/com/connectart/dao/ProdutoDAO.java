package com.connectart.dao;
import java.sql.*;

import com.connectart.models.Produto;

public class ProdutoDAO extends DAO {
    private Connection conexao;

    public ProdutoDAO() {
       super();
        conectar();
    }

    public boolean inserirProduto(Produto produto) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            String sql = "INSERT INTO connectart.produto (produto_id, produto_nome, produto_preco, produto_descricao) "
                       + "VALUES (" + produto.getProdutoId() + ", '" + produto.getProdutoNome() + "', " + produto.getProdutoPreco() + ", '" + produto.getProdutoDescricao() + "');";
            st.executeUpdate(sql);
            st.close();
            status = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return status;
    }

    public boolean atualizarProduto(Produto produto) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            String sql = "UPDATE connectart.produto SET produto_nome = '" + produto.getProdutoNome() + "', produto_preco = " + produto.getProdutoPreco() + ", produto_descricao = '" + produto.getProdutoDescricao() + "' WHERE produto_id = " + produto.getProdutoId();
            st.executeUpdate(sql);
            st.close();
            status = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return status;
    }

    public boolean excluirProduto(int produtoId) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            String sql = "DELETE FROM connectart.produto WHERE produto_id = " + produtoId;
            st.executeUpdate(sql);
            st.close();
            status = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return status;
    }

    public Produto[] getProdutos() {
        Produto[] produtos = null;

        try {
            Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM connectart.produto");

            if (rs.next()) {
                produtos = new Produto[rs.getRow()];
                rs.beforeFirst();

                for (int i = 0; rs.next(); i++) {
                    produtos[i] = new Produto(rs.getInt("produto_id"), rs.getString("produto_nome"), rs.getDouble("produto_preco"), rs.getString("produto_descricao"));
                }
            }
            st.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return produtos;
    }
}


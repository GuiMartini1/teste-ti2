package com.connectart.dao;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.connectart.models.Produto;
import java.sql.*;

public class ProdutoDAO extends DAO {

    public ProdutoDAO() {
        super();
        conectar();    
    }

    public int inserirProduto(Produto produto) {
        int produtoId = -1;
        try {
            String sql = "INSERT INTO connectart.produto (produto_nome, produto_preco, produto_descricao, artista_email, image_path) "
                       + "VALUES (?, ?, ?, ?, ?) RETURNING produto_id";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, produto.getProdutoNome());
            pst.setDouble(2, produto.getProdutoPreco());
            pst.setString(3, produto.getProdutoDescricao());
            pst.setString(4, produto.getArtistaEmail());
            pst.setString(5, produto.getImagePath());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                produtoId = rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return produtoId;
    }

    public boolean excluirProduto(int id) {
        try {
            String sql = "DELETE FROM connectart.produto WHERE produto_id = ?";
            PreparedStatement st = conexao.prepareStatement(sql);
            st.setInt(1, id);
            int rowsAffected = st.executeUpdate();
            st.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Produto autenticarProduto(int id) {
        Produto produto = null;
        try {
            String sql = "SELECT * FROM connectart.produto WHERE produto_id = ?";
            PreparedStatement st = conexao.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("produto_nome");
                double preco = rs.getDouble("produto_preco");
                String descricao = rs.getString("produto_descricao");
                String artistaEmail = rs.getString("artista_email");
                String imagePath = rs.getString("image_path");
                produto = new Produto(nome, preco, descricao, artistaEmail, imagePath);
                System.out.println("Produto autenticado: " + produto.getProdutoNome());
            } else {
                System.out.println("Nenhum produto encontrado com o id: " + id);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao autenticar produto: " + e.getMessage(), e);
        }
        return produto;
    }
}

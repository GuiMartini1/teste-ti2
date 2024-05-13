package com.connectart.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connectart.models.AvalProd;


public class AvalProdDAO extends DAO{
    

    public AvalProdDAO() {
        super();
        conectar();
    }

    public boolean inserirAvalProd(AvalProd avalProd) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            String sql = "INSERT INTO connectart.avalprod (aval_prod_id, aval_prod_pontuacao, aval_prod_comentario, aval_prod_cliente, aval_prod_produto) "
                       + "VALUES (" + avalProd.getAvalProdId() + ", " + avalProd.getAvalProdPontuacao() + ", '" + avalProd.getAvalProdComentario() + "', " + avalProd.getAvalProdCliente() + ", " + avalProd.getAvalProdProduto() + ");";
            st.executeUpdate(sql);
            st.close();
            status = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return status;
    }

    public boolean atualizarAvalProd(AvalProd avalProd) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            String sql = "UPDATE connectart.avalprod SET aval_prod_pontuacao = " + avalProd.getAvalProdPontuacao() + ", aval_prod_comentario = '" + avalProd.getAvalProdComentario() + "', aval_prod_cliente = " + avalProd.getAvalProdCliente() + ", aval_prod_produto = " + avalProd.getAvalProdProduto() + " WHERE aval_prod_id = " + avalProd.getAvalProdId();
            st.executeUpdate(sql);
            st.close();
            status = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return status;
    }

    public boolean excluirAvalProd(int avalProdId) {
        boolean status = false;
        try {
            Statement st = conexao.createStatement();
            String sql = "DELETE FROM connectart.avalprod WHERE aval_prod_id = " + avalProdId;
            st.executeUpdate(sql);
            st.close();
            status = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return status;
    }

    public AvalProd[] getAvalProds() {
        AvalProd[] avalProds = null;

        try {
            Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM connectart.avalprod");

            if (rs.next()) {
                rs.last();
                avalProds = new AvalProd[rs.getRow()];
                rs.beforeFirst();

                for (int i = 0; rs.next(); i++) {
                    avalProds[i] = new AvalProd(rs.getInt("aval_prod_id"), rs.getInt("aval_prod_pontuacao"), rs.getString("aval_prod_comentario"), rs.getInt("aval_prod_cliente"), rs.getInt("aval_prod_produto"));
                }
            }
            st.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return avalProds;
    }
}

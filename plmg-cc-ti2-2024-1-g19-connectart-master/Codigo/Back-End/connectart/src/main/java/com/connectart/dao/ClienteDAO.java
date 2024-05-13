package com.connectart.dao;

import com.connectart.dao.*;
import com.connectart.models.Cliente;
import com.connectart.models.Produto;

import java.sql.*;

public class ClienteDAO extends DAO {
    
        public ClienteDAO() {
		super();
		conectar();
	}
	
	
	public void finalize() {
		close();
	}
	
	
	public boolean add(Cliente cliente) {
		boolean status = false;
		try {
			String sql = "INSERT INTO connectart.cliente (cliente_id, cliente_nome, cliente_email, cliente_senha, cliente_compras, cliente_telefone) "
            + "VALUES ("+cliente.getClienteId()+ ", '" + cliente.getClienteNome() + "', '"  
            + cliente.getClienteEmail() + "', '" + cliente.getClienteSenha() + "', '" + cliente.getClienteCompras() + "', '" + cliente.getClienteTelefone() + "');");
			PreparedStatement st = conexao.prepareStatement(sql);
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
    }
package service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import dao.ClienteDAO;
import models.Cliente;
import spark.Request;
import spark.Response;


public class ClienteService {

	private CLienteDAO clienteDAO;

	public ClienteService() {
        //aqui ta faltando acionar a DAO pra fazer a inserção no banco de dados
		try {
			clienteDAO = new clienteDAO("cliente.dat");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public Object add(Request request, Response response) {
		String e-mail = request.queryParams("E-mail");
        String nome = request.queryParams("Nome");
        String telefone = request.queryParams("Telefone");
        String senha = request.queryParams("Senha");
        int compras=0;
        int id =1;

        Cliente cliente = new Cliente(id, nome, e-mail, senha, compras, telefone);

		clienteDAO.add(cliente);

		response.status(201); // 201 Created
		return id;
	}
}
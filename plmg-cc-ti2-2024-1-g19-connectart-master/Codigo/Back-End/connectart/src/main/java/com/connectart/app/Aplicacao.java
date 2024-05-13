package com.connectart.app;

import com.connectart.dao.ArtistaDAO;
import com.connectart.dao.AvalClienteDAO;
import com.connectart.dao.AvalProdDAO;
import com.connectart.dao.ClienteDAO;
import com.connectart.dao.ProdutoDAO;
import com.connectart.models.Artista;
import com.connectart.models.AvalCliente;
import com.connectart.models.AvalProd;
import com.connectart.models.Cliente;
import com.connectart.models.Produto;
import com.connectart.service.ProdutoService;
import com.connectart.service.ClienteService;

import spark.Spark.*;
import com.connectart.*;

public class Aplicacao {
	
	private static ProdutoService produtoService = new ProdutoService();
    private static ClienteService clienteService = new ClienteService();
	
    public static void main(String[] args) {
        
        port(6789);

        post("/produto", (request, response) -> clienteService.add(request, response));

        get("/produto/:id", (request, response) -> produtoService.get(request, response));

        get("/produto/update/:id", (request, response) -> produtoService.update(request, response));

        get("/produto/delete/:id", (request, response) -> produtoService.remove(request, response));

        get("/produto", (request, response) -> produtoService.getAll(request, response));
               
    }
    
}


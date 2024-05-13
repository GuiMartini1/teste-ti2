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

public class Aplicacao {
    public static void main(String[] args) {
        
        //cliente
        ClienteDAO clienteDAO = new ClienteDAO();
        
        // Insere um novo cliente na tabela
        Cliente cliente = new Cliente(11, "Pablo", "pablo@example.com", "senha123", 5, "1234567890");
        //chama o metodo que INSERE da ClienteDAO
        if (clienteDAO.inserirCliente(cliente)) {
            System.out.println("Inserção com sucesso -> " + cliente.toString());
        }

        // Consulta todos os clientes
        System.out.println("==== Mostrar todos os clientes === ");
        Cliente[] clientes = clienteDAO.getClientes();
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        // Atualiza os dados de um cliente
        cliente.setClienteSenha("novaSenha123");
        //chama o metodo que ATUALIZA da ClienteDAO
        clienteDAO.atualizarCliente(cliente);

        // Consulta todos os clientes após a atualização
        System.out.println("==== Mostrar clientes após atualização === ");
        //chama o metodo que MOSTRA da ClienteDAO
        clientes = clienteDAO.getClientes();
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        
        // Exclui um cliente
        //chama o metodo que EXCLUI da ClienteDAO
       // clienteDAO.excluirCliente(cliente.getClienteId());

        // Consulta todos os clientes após a exclusão
       // System.out.println("==== Mostrar clientes após exclusão === ");
        //clientes = clienteDAO.getClientes();
        //for (Cliente c : clientes) {
           // System.out.println(c);
        //}
        
      


    
    
    


    //artista
    ArtistaDAO artistaDAO = new ArtistaDAO();
        
    // Agora que a conexão está estabelecida, você pode realizar operações com `ArtistaDAO`
    
    // Exemplo de inserção de um artista
    Artista artista = new Artista(1, "Nome do Artista", "artista@exemplo.com", "senha123", "Rua do Artista, 123", "Descrição do Artista", "119999988");
    if (artistaDAO.inserirArtista(artista)) {
        System.out.println("Inserção com sucesso -> " + artista.toString());
    }

    // Exemplo de atualização de um artista
    artista.setArtistaSenha("novaSenha456");
    boolean atualizado = artistaDAO.atualizarArtista(artista);
    if (atualizado) {
        System.out.println("Artista atualizado com sucesso: " + artista);
    }

    // Exemplo de exclusão de um artista
    //boolean excluido = artistaDAO.excluirArtista(artista.getArtistaId());
    //if (excluido) {
        //System.out.println("Artista excluído com sucesso: " + artista);
    //}

    // Exemplo de consulta de artistas
    //Artista[] artistas = artistaDAO.getArtistas();
    //System.out.println("Lista de artistas:");
    //for (Artista a : artistas) {
     //   System.out.println(a.toString());
    //}





    //produto 
    ProdutoDAO produtoDAO = new ProdutoDAO();
     // Exemplo de inserção de um produto
     Produto produto = new Produto(1, "Nome do Produto", 59.99, "Descrição do Produto");
     boolean inserido = produtoDAO.inserirProduto(produto);
     if (inserido) {
         System.out.println("Produto inserido com sucesso: " + produto);
     }

     // Exemplo de atualização de um produto
     produto.setProdutoPreco(49.99);
     boolean produtoatualizado = produtoDAO.atualizarProduto(produto);
     if (produtoatualizado) {
         System.out.println("Produto atualizado com sucesso: " + produto);
     }

     // Exemplo de exclusão de um produto
     //boolean produtoexcluido = produtoDAO.excluirProduto(produto.getProdutoId());
     //if (produtoexcluido) {
        // System.out.println("Produto excluído com sucesso: " + produto);
     //}

     // Exemplo de consulta de produtos
     //Produto[] produtos = produtoDAO.getProdutos();
     //System.out.println("Lista de produtos:");
     //for (Produto p : produtos) {
        // System.out.println(p.toString());
     //}

     
     
     //avaliação cliente
     AvalClienteDAO avalClienteDAO = new AvalClienteDAO();
     // Agora que a conexão está estabelecida, você pode realizar operações com `AvalClienteDAO`
        
        // Exemplo de inserção de uma avaliação de cliente
        AvalCliente avalCliente = new AvalCliente(1, 4, "Bom trabalho", 1, 1);
        boolean avalclienteinserido = avalClienteDAO.inserirAvalCliente(avalCliente);
        if (avalclienteinserido) {
            System.out.println("Avaliação de cliente inserida com sucesso: " + avalCliente);
        }

        // Exemplo de atualização de uma avaliação de cliente
        avalCliente.setAvalClientePontuacao(5);
        boolean avalclienteatualizado = avalClienteDAO.atualizarAvalCliente(avalCliente);
        if (avalclienteatualizado) {
            System.out.println("Avaliação de cliente atualizada com sucesso: " + avalCliente);
        }

        // Exemplo de exclusão de uma avaliação de cliente
        //boolean avalclienteexcluido = avalClienteDAO.excluirAvalCliente(avalCliente.getAvalClienteId());
        //if (avalclienteexcluido) {
         //   System.out.println("Avaliação de cliente excluída com sucesso: " + avalCliente);
        //}

        // Exemplo de consulta de avaliações de clientes
        //AvalCliente[] avalClientes = avalClienteDAO.getAvalClientes();
        //System.out.println("Lista de avaliações de clientes:");
        //for (AvalCliente a : avalClientes) {
          //  System.out.println(a.toString());
        //}

        



        //avaliação produto
        AvalProdDAO avalProdDAO = new AvalProdDAO();
        // Agora que a conexão está estabelecida, você pode realizar operações com `AvalProdDAO`
        
        // Exemplo de inserção de uma avaliação de produto
        AvalProd avalProd = new AvalProd(1, 5, "Excelente produto", 2, 1);
        boolean avalprodinserido = avalProdDAO.inserirAvalProd(avalProd);
        if (avalprodinserido) {
            System.out.println("Avaliação de produto inserida com sucesso: " + avalProd);
        }

        // Exemplo de atualização de uma avaliação de produto
        avalProd.setAvalProdPontuacao(4);
        boolean avalprodatualizado = avalProdDAO.atualizarAvalProd(avalProd);
        if (avalprodatualizado) {
            System.out.println("Avaliação de produto atualizada com sucesso: " + avalProd);
        }

        // Exemplo de exclusão de uma avaliação de produto
        //boolean avalprodexcluido = avalProdDAO.excluirAvalProd(avalProd.getAvalProdId());
        //if (avalprodexcluido) {
         //   System.out.println("Avaliação de produto excluída com sucesso: " + avalProd);
        //}

        // Exemplo de consulta de avaliações de produtos
        //AvalProd[] avalProds = avalProdDAO.getAvalProds();
        //System.out.println("Lista de avaliações de produtos:");
        //for (AvalProd a : avalProds) {
         //   System.out.println(a.toString());
        //}

        
        
    
    
    }
    
    
}


package br.edu.iftm.ds.exemplos.arquitetura.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.iftm.ds.exemplos.arquitetura.domain.Cliente;

@Repository
public class ClienteRepository {

    private List<Cliente> clientes;

    public ClienteRepository() {
        clientes = new ArrayList<>();

        Cliente senna = Cliente.builder()
                               .codigo(1)
                               .nome("Ayrton Senna")
                               .build();

        Cliente fangio = Cliente.builder()
                                .codigo(2)
                                .nome("Juan Manoel Fangio")
                                .build();

        Cliente verstappen = new Cliente(3,"Verstappen");
        
        clientes.add(senna);
        clientes.add(fangio);
        clientes.add(verstappen);
    }

    public List<Cliente> findAll() {
        return clientes;
    }

    public void save(Cliente cliente) {
        clientes.add(cliente);
    }

}

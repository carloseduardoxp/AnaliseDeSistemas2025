package br.edu.iftm.ds.exemplos.arquitetura.control;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.ds.exemplos.arquitetura.domain.Cliente;
import br.edu.iftm.ds.exemplos.arquitetura.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteControl {
    
    private ClienteRepository repository;

    public ClienteControl(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cliente> getClientes() {
        return repository.findAll();
    }

    @GetMapping("/{id}") 
    public Cliente getClienteCodigo(@PathVariable("id") Integer codigo) {
        return new Cliente(codigo,"esse cara nao existe senhor");
    }

}

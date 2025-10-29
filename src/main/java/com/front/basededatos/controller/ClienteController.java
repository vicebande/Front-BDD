package com.front.basededatos.controller;


import com.front.basededatos.model.Cliente;
import com.front.basededatos.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }
}


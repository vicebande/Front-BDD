package com.front.basededatos.controller;


import com.front.basededatos.model.TipoCliente;
import com.front.basededatos.repository.TipoClienteRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteController {
    private final TipoClienteRepository tipoClienteRepository;

    public TipoClienteController(TipoClienteRepository tipoClienteRepository) {
        this.tipoClienteRepository = tipoClienteRepository;
    }

    @GetMapping
    public List<TipoCliente> getAll() {
        return tipoClienteRepository.findAll();
    }
}

package com.front.basededatos.controller;


import com.front.basededatos.model.HistMultasCliente;
import com.front.basededatos.repository.HistMultasClienteRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/hist-multas-cliente")
public class HistMultasClienteController {
    private final HistMultasClienteRepository histMultasClienteRepository;

    public HistMultasClienteController(HistMultasClienteRepository histMultasClienteRepository) {
        this.histMultasClienteRepository = histMultasClienteRepository;
    }

    @GetMapping
    public List<HistMultasCliente> getAll() {
        return histMultasClienteRepository.findAll();
    }
}

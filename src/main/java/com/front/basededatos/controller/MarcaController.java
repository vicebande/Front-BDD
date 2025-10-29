package com.front.basededatos.controller;


import com.front.basededatos.model.Marca;
import com.front.basededatos.repository.MarcaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/marcas")
public class MarcaController {
    private final MarcaRepository marcaRepository;

    public MarcaController(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @GetMapping
    public List<Marca> getAll() {
        return marcaRepository.findAll();
    }
}

package com.front.basededatos.controller;


import com.front.basededatos.model.Comuna;
import com.front.basededatos.repository.ComunaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/comunas")
public class ComunaController {
    private final ComunaRepository comunaRepository;

    public ComunaController(ComunaRepository comunaRepository) {
        this.comunaRepository = comunaRepository;
    }

    @GetMapping
    public List<Comuna> getAll() {
        return comunaRepository.findAll();
    }
}

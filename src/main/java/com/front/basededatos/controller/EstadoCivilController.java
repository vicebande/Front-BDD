package com.front.basededatos.controller;


import com.front.basededatos.model.EstadoCivil;
import com.front.basededatos.repository.EstadoCivilRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/estadocivil")
public class EstadoCivilController {
    private final EstadoCivilRepository estadoCivilRepository;

    public EstadoCivilController(EstadoCivilRepository estadoCivilRepository) {
        this.estadoCivilRepository = estadoCivilRepository;
    }

    @GetMapping
    public List<EstadoCivil> getAll() {
        return estadoCivilRepository.findAll();
    }
}

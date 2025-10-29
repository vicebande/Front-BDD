package com.front.basededatos.controller;


import com.front.basededatos.model.Camion;
import com.front.basededatos.repository.CamionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/camiones")
public class CamionController {
    private final CamionRepository camionRepository;

    public CamionController(CamionRepository camionRepository) {
        this.camionRepository = camionRepository;
    }

    @GetMapping
    public List<Camion> getAll() {
        return camionRepository.findAll();
    }
}


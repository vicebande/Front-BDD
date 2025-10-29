package com.front.basededatos.controller;


import com.front.basededatos.model.TipoCamion;
import com.front.basededatos.repository.TipoCamionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/tipocamion")
public class TipoCamionController {
    private final TipoCamionRepository tipoCamionRepository;

    public TipoCamionController(TipoCamionRepository tipoCamionRepository) {
        this.tipoCamionRepository = tipoCamionRepository;
    }

    @GetMapping
    public List<TipoCamion> getAll() {
        return tipoCamionRepository.findAll();
    }
}

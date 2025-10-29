package com.front.basededatos.controller;


import com.front.basededatos.model.ArriendoCamion;
import com.front.basededatos.repository.ArriendoCamionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/arriendos")
public class ArriendoCamionController {
    private final ArriendoCamionRepository arriendoCamionRepository;

    public ArriendoCamionController(ArriendoCamionRepository arriendoCamionRepository) {
        this.arriendoCamionRepository = arriendoCamionRepository;
    }

    @GetMapping
    public List<ArriendoCamion> getAll() {
        return arriendoCamionRepository.findAll();
    }
}

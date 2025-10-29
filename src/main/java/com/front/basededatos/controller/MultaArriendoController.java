package com.front.basededatos.controller;


import com.front.basededatos.model.MultaArriendo;
import com.front.basededatos.repository.MultaArriendoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/multas")
public class MultaArriendoController {
    private final MultaArriendoRepository multaArriendoRepository;

    public MultaArriendoController(MultaArriendoRepository multaArriendoRepository) {
        this.multaArriendoRepository = multaArriendoRepository;
    }

    @GetMapping
    public List<MultaArriendo> getAll() {
        return multaArriendoRepository.findAll();
    }
}

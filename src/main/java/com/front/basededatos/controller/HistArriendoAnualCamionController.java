package com.front.basededatos.controller;


import com.front.basededatos.model.HistArriendoAnualCamion;
import com.front.basededatos.repository.HistArriendoAnualCamionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/hist-arriendo-anual-camion")
public class HistArriendoAnualCamionController {
    private final HistArriendoAnualCamionRepository histArriendoAnualCamionRepository;

    public HistArriendoAnualCamionController(HistArriendoAnualCamionRepository histArriendoAnualCamionRepository) {
        this.histArriendoAnualCamionRepository = histArriendoAnualCamionRepository;
    }

    @GetMapping
    public List<HistArriendoAnualCamion> getAll() {
        return histArriendoAnualCamionRepository.findAll();
    }
}

package com.front.basededatos.controller;


import com.front.basededatos.model.TipoSalud;
import com.front.basededatos.repository.TipoSaludRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/tiposalud")
public class TipoSaludController {
    private final TipoSaludRepository tipoSaludRepository;

    public TipoSaludController(TipoSaludRepository tipoSaludRepository) {
        this.tipoSaludRepository = tipoSaludRepository;
    }

    @GetMapping
    public List<TipoSalud> getAll() {
        return tipoSaludRepository.findAll();
    }
}

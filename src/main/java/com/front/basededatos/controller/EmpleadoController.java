package com.front.basededatos.controller;


import com.front.basededatos.model.Empleado;
import com.front.basededatos.repository.EmpleadoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @GetMapping
    public List<Empleado> getAll() {
        return empleadoRepository.findAll();
    }
}

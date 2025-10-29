package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HIST_MULTAS_CLIENTE")
public class HistMultasCliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Puedes ajustar la PK según la tabla real
    // ...otros campos según la tabla...
}

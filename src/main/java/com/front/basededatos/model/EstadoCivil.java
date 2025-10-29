package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ESTADO_CIVIL")
public class EstadoCivil implements Serializable {
    @Id
    @Column(name = "id_estado_civil")
    private Integer idEstadoCivil;
    // ...otros campos según la tabla...
}

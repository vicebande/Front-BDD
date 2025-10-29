package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CAMION")
public class Camion implements Serializable {
    @Id
    @Column(name = "nro_patente")
    private String nroPatente;
    // ...otros campos según la tabla...
}

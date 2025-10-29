package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COMUNA")
public class Comuna implements Serializable {
    @Id
    @Column(name = "id_comuna")
    private Integer idComuna;
    // ...otros campos según la tabla...
}

package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MULTA_ARRIENDO")
public class MultaArriendo implements Serializable {
    @Id
    @Column(name = "id_arriendo")
    private Long idArriendo;
    // ...otros campos según la tabla...
}

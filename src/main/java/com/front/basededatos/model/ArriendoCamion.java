package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ARRIENDO_CAMION")
public class ArriendoCamion implements Serializable {
    @Id
    @Column(name = "id_arriendo")
    private Long idArriendo;
    // ...otros campos según la tabla...
}

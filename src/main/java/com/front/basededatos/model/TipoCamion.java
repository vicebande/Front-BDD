package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TIPO_CAMION")
public class TipoCamion implements Serializable {
    @Id
    @Column(name = "id_tipo_camion")
    private String idTipoCamion;
    // ...otros campos según la tabla...
}

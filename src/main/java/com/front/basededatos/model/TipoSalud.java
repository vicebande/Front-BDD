package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TIPO_SALUD")
public class TipoSalud implements Serializable {
    @Id
    @Column(name = "id_tipo_sal")
    private String idTipoSal;
    // ...otros campos según la tabla...
}

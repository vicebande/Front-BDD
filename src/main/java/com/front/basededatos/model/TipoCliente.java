package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TIPO_CLIENTE")
public class TipoCliente implements Serializable {
    @Id
    @Column(name = "id_tipo_cli")
    private String idTipoCli;
    // ...otros campos según la tabla...
}

package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MARCA")
public class Marca implements Serializable {
    @Id
    @Column(name = "id_marca")
    private Integer idMarca;
    // ...otros campos según la tabla...
}

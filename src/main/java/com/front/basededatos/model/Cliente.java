package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {
    @Id
    @Column(name = "numrun_cli")
    private Long numrunCli;
    // ...otros campos según la tabla...
}

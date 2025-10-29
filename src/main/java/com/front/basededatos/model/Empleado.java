package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {
    @Id
    @Column(name = "numrun_emp")
    private Long numrunEmp;
    // ...otros campos según la tabla...
}

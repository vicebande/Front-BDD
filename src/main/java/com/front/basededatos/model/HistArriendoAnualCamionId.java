package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class HistArriendoAnualCamionId implements Serializable {
    @Column(name = "anno_proceso")
    private Integer annoProceso;
    @Column(name = "nro_patente")
    private String nroPatente;

    public HistArriendoAnualCamionId() {}

    public HistArriendoAnualCamionId(Integer annoProceso, String nroPatente) {
        this.annoProceso = annoProceso;
        this.nroPatente = nroPatente;
    }

    // getters y setters
    public Integer getAnnoProceso() { return annoProceso; }
    public void setAnnoProceso(Integer annoProceso) { this.annoProceso = annoProceso; }
    public String getNroPatente() { return nroPatente; }
    public void setNroPatente(String nroPatente) { this.nroPatente = nroPatente; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistArriendoAnualCamionId that = (HistArriendoAnualCamionId) o;
        return Objects.equals(annoProceso, that.annoProceso) && Objects.equals(nroPatente, that.nroPatente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annoProceso, nroPatente);
    }
}
package com.front.basededatos.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HIST_ARRIENDO_ANUAL_CAMION")
public class HistArriendoAnualCamion implements Serializable {
    @EmbeddedId
    private HistArriendoAnualCamionId id;

    public HistArriendoAnualCamionId getId() {
        return id;
    }

    public void setId(HistArriendoAnualCamionId id) {
        this.id = id;
    }
    // ...otros campos según la tabla...
}



package com.front.basededatos.repository;

import com.front.basededatos.model.TipoSalud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoSaludRepository extends JpaRepository<TipoSalud, String> {
}

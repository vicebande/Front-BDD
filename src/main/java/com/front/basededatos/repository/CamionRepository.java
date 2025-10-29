package com.front.basededatos.repository;

import com.front.basededatos.model.Camion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamionRepository extends JpaRepository<Camion, String> {
}

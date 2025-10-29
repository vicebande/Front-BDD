package com.front.basededatos.repository;

import com.front.basededatos.model.TipoCamion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoCamionRepository extends JpaRepository<TipoCamion, String> {
}

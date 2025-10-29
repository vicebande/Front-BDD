package com.front.basededatos.repository;

import com.front.basededatos.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}

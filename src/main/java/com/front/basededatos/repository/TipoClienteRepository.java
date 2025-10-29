package com.front.basededatos.repository;

import com.front.basededatos.model.TipoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, String> {
}

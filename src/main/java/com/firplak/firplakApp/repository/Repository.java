package com.firplak.firplakApp.repository;

import com.firplak.firplakApp.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cliente, Long> {
}

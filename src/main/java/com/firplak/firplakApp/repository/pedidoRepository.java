package com.firplak.firplakApp.repository;

import com.firplak.firplakApp.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pedidoRepository extends JpaRepository<Pedido, Long> {
}
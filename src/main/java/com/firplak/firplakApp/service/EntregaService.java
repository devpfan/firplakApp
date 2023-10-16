package com.firplak.firplakApp.service;

import com.firplak.firplakApp.model.Entrega;

import java.util.List;

public interface EntregaService {

    Entrega guardarEntrega(Entrega entrega);

    Entrega obtenerEntregaPorId(Long entregaId);

    List<Entrega>obtenerEntregasPorPedido(Long pedidoId);


    Entrega actualizarEntrega(Entrega entrega);

    void borrarEntrega(Long entredaId);

    List<Entrega> obtenerTodasLasEntregas();
}

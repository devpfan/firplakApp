package com.firplak.firplakApp.service;

import com.firplak.firplakApp.model.Pedido;

import java.util.List;

public interface PedidoService {
    Pedido savePedido(Pedido pedido);
    List<Pedido> getAllPedidos();
}

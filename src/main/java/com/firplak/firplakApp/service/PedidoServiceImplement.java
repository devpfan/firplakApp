package com.firplak.firplakApp.service;

import com.firplak.firplakApp.model.Pedido;
import com.firplak.firplakApp.repository.pedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImplement implements PedidoService{
    @Autowired
    private pedidoRepository pedidoRepo;

    @Override
    public Pedido savePedido(Pedido pedido){
        return pedidoRepo.save(pedido);
    }

    @Override
    public List<Pedido> getAllPedidos(){
        return pedidoRepo.findAll();
    }
}

package com.firplak.firplakApp.service;

import com.firplak.firplakApp.model.Entrega;
import com.firplak.firplakApp.repository.entregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EntregaServiceImplement implements EntregaService{
    private final entregaRepository entregaRepo;

    @Autowired
    public EntregaServiceImplement(entregaRepository entregaRepo){
        this.entregaRepo = entregaRepo;
    }

    @Override
    public Entrega guardarEntrega(Entrega entrega){
        return entregaRepo.save(entrega);
    }

    @Override
    public Entrega obtenerEntregaPorId(Long entregaId){
        Optional<Entrega> entregaOptional = entregaRepo.findById(entregaId);
        return  entregaOptional.orElse(null);
    }

    @Override
    public List<Entrega> obtenerEntregasPorPedido(Long pedidoId){
        return entregaRepo.findAll()
                .stream()
                .filter(entrega -> entrega.getPedido().getPedido_id().equals(pedidoId))
                .collect(Collectors.toList());
    }

    @Override
    public Entrega actualizarEntrega(Entrega entrega){
        return entregaRepo.save(entrega);
    }

    @Override
    public void borrarEntrega(Long entregaId){
        entregaRepo.deleteById(entregaId);
    }

    @Override
    public List<Entrega>obtenerTodasLasEntregas(){
        return entregaRepo.findAll();
    }
}

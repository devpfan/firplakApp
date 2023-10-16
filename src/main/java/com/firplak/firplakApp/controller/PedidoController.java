package com.firplak.firplakApp.controller;

import com.firplak.firplakApp.model.Pedido;
import com.firplak.firplakApp.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/crearPedido")
    public String savePedido(@RequestBody Pedido pedido){
        pedidoService.savePedido(pedido);
        return "Pedido creado exitosamente";
    }

    @GetMapping("/pedido")
    public List<Pedido> getPedido(){
        return pedidoService.getAllPedidos();
    }

}

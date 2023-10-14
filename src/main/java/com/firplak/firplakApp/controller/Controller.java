package com.firplak.firplakApp.controller;

import com.firplak.firplakApp.model.Cliente;
import com.firplak.firplakApp.model.Pedido;
import com.firplak.firplakApp.repository.clienteRepository;
import com.firplak.firplakApp.repository.pedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private clienteRepository repo;
    @Autowired
    private pedidoRepository pedidoRepo;

    @GetMapping()
    public String prueba(){
        return "Conexion inicial exitosa...";
    }


    @PostMapping("/crearCliente")  //Metodo post para agregar clientes nuevos
        public String saveCliente(@RequestBody Cliente cliente){
        repo.save(cliente);
        return "Cliente ingresado exitosamente";
    }

    @GetMapping("/cliente")
    public List<Cliente> getCliente(){
        return repo.findAll();
    }


    @PostMapping("/crearPedido")
    public String savePedido(@RequestBody Pedido pedido) {
        pedidoRepo.save(pedido);
        return "Pedido creado exitosamente.";
    }

    @GetMapping("/pedido")
    public List<Pedido> getPedido() {
        return pedidoRepo.findAll();
    }
}

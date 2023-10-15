package com.firplak.firplakApp.controller;

import com.firplak.firplakApp.model.Cliente;
import com.firplak.firplakApp.model.Pedido;
import com.firplak.firplakApp.repository.clienteRepository;
import com.firplak.firplakApp.repository.pedidoRepository;
import com.firplak.firplakApp.service.ClienteService;
import com.firplak.firplakApp.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private PedidoService pedidoService;

    @GetMapping()
    public String prueba(){
        return "Conexion inicial exitosa...";
    }


    @PostMapping("/crearCliente")  //Metodo post para agregar clientes nuevos
        public String saveCliente(@RequestBody Cliente cliente){
        clienteService.saveCliente(cliente);
        return "Cliente ingresado exitosamente";
    }
    @GetMapping("/cliente")
    public List<Cliente> getCliente(){
        return clienteService.getAllClientes();
    }

    @PostMapping("/crearPedido")
    public String savePedido(@RequestBody Pedido pedido) {
        pedidoService.savePedido(pedido);
        return "Pedido creado exitosamente.";

    }

    @GetMapping("/pedido")
    public List<Pedido> getPedido() {
         return pedidoService.getAllPedidos();
    }
}

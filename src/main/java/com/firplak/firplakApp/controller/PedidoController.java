package com.firplak.firplakApp.controller;

import com.firplak.firplakApp.model.Cliente;
import com.firplak.firplakApp.model.Pedido;
import com.firplak.firplakApp.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import com.firplak.firplakApp.service.ClienteService;



import java.util.List;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ClienteService clienteService;
    @GetMapping("/pedidos/mostrar")
    public String mostrarPedidos(Model model) {
        List<Pedido> pedidos = pedidoService.getAllPedidos();
        model.addAttribute("pedidos", pedidos);
        return "listarPedidos";
    }
    @PostMapping("/pedidos/registrar")
    public String guardarPedido(Pedido pedido) {
        pedidoService.savePedido(pedido);
        return "confirmacionPedido";
    }

    @GetMapping("/pedidos/registrar")
    public String mostrarFormularioPedido(Model model) {
        List<Cliente> clientes = clienteService.getAllClientes();
        model.addAttribute("clientes", clientes);
        model.addAttribute("pedido", new Pedido());
        return "registrarPedido";
    }




    /*@PostMapping("/crearPedido")
    public String savePedido(@RequestBody Pedido pedido){
        pedidoService.savePedido(pedido);
        return "Pedido creado exitosamente";
    }

    @GetMapping("/pedido")
    public List<Pedido> getPedido(){
        return pedidoService.getAllPedidos();
    }*/

}

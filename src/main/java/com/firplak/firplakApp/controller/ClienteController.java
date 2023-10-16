package com.firplak.firplakApp.controller;

import com.firplak.firplakApp.model.Cliente;
import com.firplak.firplakApp.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



import java.util.List;

@Controller
public class ClienteController {

   @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes/mostrar")
    public String mostrarClientes(Model model) {
        List<Cliente> clientes = clienteService.getAllClientes();
        model.addAttribute("clientes", clientes);
        return "listarClientes";
    }


    @PostMapping("/clientes/registrar")
    public String guardarCliente(Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "confirmacion";
    }
    @GetMapping("/clientes/registrar")
    public String mostrarFormularioCliente(Model model) {
        Cliente cliente = new Cliente();
        cliente.setCliente_id(null);
        model.addAttribute("cliente", cliente);
        return "registrarCliente";
    }


 /*
  @PostMapping("/crearCliente")
    public String saveCliente(@RequestBody Cliente cliente){
        clienteService.saveCliente(cliente);
        return "Cliente ingresado exitosamente";
    }

    @GetMapping("/cliente")
    public List<Cliente> getCliente(){

        return clienteService.getAllClientes();
    }*/
}

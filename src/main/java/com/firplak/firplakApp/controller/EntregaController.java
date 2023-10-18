package com.firplak.firplakApp.controller;


import com.firplak.firplakApp.model.Entrega;
import com.firplak.firplakApp.model.Pedido;
import com.firplak.firplakApp.service.EntregaService;
import com.firplak.firplakApp.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.*;

import java.util.List;

@Controller
public class EntregaController {

   @Autowired
   private EntregaService entregaService;
   @Autowired
   private PedidoService pedidoService;

   @GetMapping("/entregas/mostrar")
   public String mostrarEntregas(Model model) {
       List<Entrega> entregas = entregaService.obtenerTodasLasEntregas();
       model.addAttribute("entregas", entregas);
       return "listarEntrega";
   }

   @PostMapping("/entregas/registrar")
   public String guardarEntrega(Entrega entrega){
       entregaService.guardarEntrega(entrega);
       return "listarEntrega";
   }

   @GetMapping("/entregas/registrar")
    public String mostrarFormularioEntrega(Model model){
       List<Pedido> pedidos = pedidoService.getAllPedidos();
       model.addAttribute("entrega", new Entrega());
       model.addAttribute("pedidos", pedidos);
       return "registrarEntrega";
   }





    /*
    @PostMapping("/entregas")
    public ResponseEntity<String>crearEntrega(@RequestBody Entrega entrega){
        entregaService.guardarEntrega(entrega);
        return ResponseEntity.ok("Entrega registrada con exito");
    }

    @GetMapping("/entregas/{entregaId}")
    public Entrega obtenerEntrega(@PathVariable Long entregaId){
        return entregaService.obtenerEntregaPorId(entregaId);
    }

    @GetMapping("/entregas/todas")
    public List<Entrega>obtenerTodasLasEntregas(){
        return entregaService.obtenerTodasLasEntregas();
    }
    */


}

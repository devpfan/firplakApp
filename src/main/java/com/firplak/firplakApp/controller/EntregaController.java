package com.firplak.firplakApp.controller;

import com.firplak.firplakApp.model.Entrega;
import com.firplak.firplakApp.service.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EntregaController {

private final EntregaService entregaService;

    @Autowired
        public EntregaController(EntregaService entregaService){
        this.entregaService=entregaService;
    }

    @PostMapping("/entregas")
    public ResponseEntity<String>crearEntrega(@RequestBody Entrega entrega){
        entregaService.guardarEntrega(entrega);
        return ResponseEntity.ok("Entrega registrada con exito");
    }

    @GetMapping("entregas/{entregaId}")
    public Entrega obtenerEntrega(@PathVariable Long entregaId){
        return entregaService.obtenerEntregaPorId(entregaId);
    }

}

package com.firplak.firplakApp.controller;

import com.firplak.firplakApp.model.Pedido;
import com.firplak.firplakApp.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

     @GetMapping()
    public String prueba(){
        return "Conexion inicial exitosa...";
    }


}

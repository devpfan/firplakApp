package com.firplak.firplakApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping()
    public String prueba(){
        return "CONECTADO";
    }
}

package com.api_ed.practica.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotacion

public class HolaMundoController {

    @GetMapping("/api")
    public String holaMundo(){
        return "Hola mundo";
    }


}

package com.rodiziocarro.rodizioCarro.controller;


import com.rodiziocarro.rodizioCarro.entity.Carro;
import com.rodiziocarro.rodizioCarro.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    CarroService carroService;

    @PostMapping("/cad")
    public Carro cadastarCarro(@RequestBody Carro carro){

        return carroService.cadastrarCarro(carro);

    }
}

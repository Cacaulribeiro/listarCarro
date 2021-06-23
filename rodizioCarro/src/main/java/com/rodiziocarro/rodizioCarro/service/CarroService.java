package com.rodiziocarro.rodizioCarro.service;

import com.rodiziocarro.rodizioCarro.entity.Carro;
import com.rodiziocarro.rodizioCarro.entity.Usuario;
import com.rodiziocarro.rodizioCarro.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;


    public Carro cadastrarCarro (Carro carro){
        return  carroRepository.save(carro);
    }

    public Optional<Carro> buscarCarro (Long id){
        return carroRepository.findByID(id);
    }

}

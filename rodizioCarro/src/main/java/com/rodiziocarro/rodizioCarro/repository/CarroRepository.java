package com.rodiziocarro.rodizioCarro.repository;


import com.rodiziocarro.rodizioCarro.entity.Carro;
import com.rodiziocarro.rodizioCarro.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {


    public Carro save (Carro carro);

    Optional<Carro> findByID(Long id);




}

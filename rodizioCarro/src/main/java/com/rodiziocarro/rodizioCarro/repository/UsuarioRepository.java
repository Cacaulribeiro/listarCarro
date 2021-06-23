package com.rodiziocarro.rodizioCarro.repository;

import com.rodiziocarro.rodizioCarro.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    public Usuario save (Usuario usuario);

    Optional<Usuario> findByID(Long id);

    Optional<Usuario> findByemail(String email);

    Optional<Usuario> findBycpf(String cpf);


}

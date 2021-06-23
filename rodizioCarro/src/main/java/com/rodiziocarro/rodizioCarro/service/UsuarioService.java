package com.rodiziocarro.rodizioCarro.service;

import com.rodiziocarro.rodizioCarro.entity.Usuario;
import com.rodiziocarro.rodizioCarro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public Usuario cadastrarUsuario (Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> acharUsuarioEmail (String email){
        return usuarioRepository.findByemail(email);
    }

    public Optional<Usuario> acharUsuarioCpf (String cpf){
        return usuarioRepository.findBycpf(cpf);
    }




}

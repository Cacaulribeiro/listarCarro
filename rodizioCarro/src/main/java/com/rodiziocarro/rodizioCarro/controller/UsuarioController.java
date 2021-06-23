package com.rodiziocarro.rodizioCarro.controller;


import com.rodiziocarro.rodizioCarro.entity.Usuario;
import com.rodiziocarro.rodizioCarro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){

        Optional <Usuario> pesquisaUsu = usuarioService.acharUsuarioEmail(usuario.getEmail());
        Optional <Usuario> pesquisaUsucpf= usuarioService.acharUsuarioCpf(usuario.getCpf());

        if (pesquisaUsu.isPresent() || pesquisaUsucpf.isPresent()){
            return null;
        }

        return usuarioService.cadastrarUsuario(usuario);
    }

}

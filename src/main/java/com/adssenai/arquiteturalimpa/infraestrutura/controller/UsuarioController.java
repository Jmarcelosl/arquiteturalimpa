package com.adssenai.arquiteturalimpa.infraestrutura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adssenai.arquiteturalimpa.aplication.usecases.UsuarioUseCase;
import com.adssenai.arquiteturalimpa.domain.Usuario;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioUseCase useCase;

    @PostMapping("/novo")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return useCase.createUsuario(usuario);
    }

}
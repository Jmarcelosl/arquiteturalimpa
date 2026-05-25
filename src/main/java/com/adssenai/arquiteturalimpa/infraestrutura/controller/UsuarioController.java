package com.adssenai.arquiteturalimpa.infraestrutura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adssenai.arquiteturalimpa.aplication.usecases.UsuarioUseCase;
import com.adssenai.arquiteturalimpa.domain.Usuario;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioUseCase useCase;

    @PostMapping("/novo")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return useCase.createUsuario(usuario);
    }

    @GetMapping("/lista")
    public List<Usuario> lista() {
        return useCase.listaUsuarios();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Integer id) {
        useCase.deleteUsuario(id);
    }

    @PutMapping("/editar/{id}")
    public Usuario editar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return useCase.updateUsuario(id, usuario);
    }
}
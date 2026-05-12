package com.adssenai.arquiteturalimpa.aplication.usecases;

import java.util.List;

import com.adssenai.arquiteturalimpa.aplication.gateways.UsuarioGateway;
import com.adssenai.arquiteturalimpa.domain.Usuario;

public class UsuarioUseCase {

    public final UsuarioGateway gateway;

    public UsuarioUseCase(UsuarioGateway gateway) {
        this.gateway = gateway;
    }

    public Usuario createUsuario(Usuario usuario) {
        return gateway.createUsuario(usuario);
    }

    public List<Usuario> listaUsuarios() {
        return gateway.listaUsuarios();
    }

    public void deleteUsuario(Integer id) {
        gateway.deleteUsuario(id);
    }

    public Usuario updateUsuario(Integer id, Usuario usuario) {
        return gateway.updateUsuario(id, usuario);
    }

}

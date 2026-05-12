package com.adssenai.arquiteturalimpa.aplication.gateways;

import java.util.List;

import com.adssenai.arquiteturalimpa.domain.Usuario;

public interface UsuarioGateway {

    Usuario createUsuario(Usuario usuario);

    List<Usuario> listaUsuarios();

    void deleteUsuario(Integer id);

    Usuario updateUsuario(Integer id, Usuario usuario);
}

package com.adssenai.arquiteturalimpa.infraestrutura.mappers;

import org.springframework.stereotype.Component;

import com.adssenai.arquiteturalimpa.domain.Usuario;
import com.adssenai.arquiteturalimpa.infraestrutura.persistence.UsuarioEntity;

@Component
public class UsuarioMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.nome(), usuario.password(), usuario.email());
    }

    public Usuario toDomain(UsuarioEntity entity) {
        return new Usuario(entity.getNome(), entity.getPassword(), entity.getEmail());
    }
}
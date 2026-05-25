package com.adssenai.arquiteturalimpa.infraestrutura.gateways;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adssenai.arquiteturalimpa.aplication.gateways.UsuarioGateway;
import com.adssenai.arquiteturalimpa.domain.Usuario;
import com.adssenai.arquiteturalimpa.infraestrutura.mappers.UsuarioMapper;
import com.adssenai.arquiteturalimpa.infraestrutura.persistence.UsuarioEntity;
import com.adssenai.arquiteturalimpa.infraestrutura.persistence.UsuarioRepository;

@Service
public class UsuarioServiceGateway implements UsuarioGateway {

    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioMapper mapper;

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return mapper.toDomain(repository.save(mapper.toEntity(usuario)));
    }

    @Override
    public List<Usuario> listaUsuarios() {
        List<UsuarioEntity> usuarios = repository.findAll();
        return usuarios.stream().map(u -> mapper.toDomain(u)).toList();
    }

    @Override
    public void deleteUsuario(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUsuario'");
    }

    @Override
    public Usuario updateUsuario(Integer id, Usuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUsuario'");
    }

}

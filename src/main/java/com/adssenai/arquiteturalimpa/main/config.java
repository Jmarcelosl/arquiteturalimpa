package com.adssenai.arquiteturalimpa.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adssenai.arquiteturalimpa.aplication.gateways.UsuarioGateway;
import com.adssenai.arquiteturalimpa.aplication.usecases.UsuarioUseCase;

@Configuration
public class config {

    @Bean
    public UsuarioUseCase usuarioUseCase(UsuarioGateway usuarioGateway) {
        return new UsuarioUseCase(usuarioGateway);
    }
}
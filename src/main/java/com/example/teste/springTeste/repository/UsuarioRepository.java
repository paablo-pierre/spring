package com.example.teste.springTeste.repository;

import com.example.teste.springTeste.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional <Usuario> findByEmail(String email);
}

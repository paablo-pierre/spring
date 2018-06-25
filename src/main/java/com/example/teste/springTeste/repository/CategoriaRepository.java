package com.example.teste.springTeste.repository;

import com.example.teste.springTeste.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

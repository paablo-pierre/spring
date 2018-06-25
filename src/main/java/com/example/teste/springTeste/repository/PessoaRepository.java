package com.example.teste.springTeste.repository;

import com.example.teste.springTeste.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}

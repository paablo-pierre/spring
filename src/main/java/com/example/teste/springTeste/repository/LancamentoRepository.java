package com.example.teste.springTeste.repository;

import com.example.teste.springTeste.model.Lancamento;
import com.example.teste.springTeste.repository.lancamento.LancamentoRespositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRespositoryQuery {


}

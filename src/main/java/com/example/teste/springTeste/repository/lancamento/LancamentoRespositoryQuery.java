package com.example.teste.springTeste.repository.lancamento;

import com.example.teste.springTeste.model.Lancamento;
import com.example.teste.springTeste.repository.Filter.LancamentoFilter;
import com.example.teste.springTeste.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRespositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
    public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}

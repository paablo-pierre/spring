package com.example.teste.springTeste.service;

import com.example.teste.springTeste.model.Lancamento;
import com.example.teste.springTeste.model.Pessoa;
import com.example.teste.springTeste.repository.LancamentoRepository;
import com.example.teste.springTeste.repository.PessoaRepository;
import com.example.teste.springTeste.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
        if(pessoa == null || pessoa.isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }

        return lancamentoRepository.save(lancamento);
    }

}

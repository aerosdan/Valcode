package com.valcode.service;

import com.valcode.helper.CsvPagamenosHelper;
import com.valcode.model.entity.Pagamentos;
import com.valcode.model.repository.FonteRepository;
import com.valcode.model.repository.PagamentoRepository;
import com.valcode.model.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CsvPagamentoService {

    private final PagamentoRepository repository;

    @Autowired
    public CsvPagamentoService(PagamentoRepository repository){
        this.repository = repository;
    }

    @Autowired
    private static FonteRepository fonteRepository;
    @Autowired
    private static PessoaFisicaRepository pessoaFisicaRepository;

    public void save(MultipartFile file){
        try{

            List<Pagamentos> modalidades = CsvPagamenosHelper.csvToFonte(file.getInputStream());
            repository.saveAll(modalidades);
        } catch (IOException e){
            throw new RuntimeException("Fail to Store csv data " + e.getMessage());
        }
    }
}

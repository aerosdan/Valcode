package com.valcode.service;

import com.valcode.helper.CsvMovimentosHelper;
import com.valcode.model.entity.Movimentos;
import com.valcode.model.repository.FonteRepository;
import com.valcode.model.repository.MovimentosRepository;
import com.valcode.model.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CsvMovimentosService {
    private final MovimentosRepository repository;

    @Autowired
    public CsvMovimentosService(MovimentosRepository repository){
        this.repository = repository;
    }

    @Autowired
    private static FonteRepository fonteRepository;
    @Autowired
    private static PessoaFisicaRepository pessoaFisicaRepository;

    public void save(MultipartFile file){
        try{
            CsvMovimentosHelper csvMovimentosHelper = new CsvMovimentosHelper(pessoaFisicaRepository, fonteRepository);
            List<Movimentos> modalidades = csvMovimentosHelper.csvToFonte(file.getInputStream());
            repository.saveAll(modalidades);
        } catch (IOException e){
            throw new RuntimeException("Fail to Store csv data " + e.getMessage());
        }
    }
}

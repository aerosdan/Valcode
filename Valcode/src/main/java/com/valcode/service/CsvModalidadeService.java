package com.valcode.service;

import com.valcode.helper.CsvModalidadeHelper;
import com.valcode.model.entity.Modalidade;
import com.valcode.model.repository.ModalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CsvModalidadeService {


    private final ModalidadeRepository repository;

    @Autowired
    public CsvModalidadeService(ModalidadeRepository repository){
        this.repository = repository;
    }

    public void save(MultipartFile file){
        try{
            List<Modalidade> modalidades = CsvModalidadeHelper.csvToFonte(file.getInputStream());
            repository.saveAll(modalidades);
        } catch (IOException e){
            throw new RuntimeException("Fail to Store csv data " + e.getMessage());
        }
    }
    
}

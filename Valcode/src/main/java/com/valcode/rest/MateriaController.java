package com.valcode.rest;

import com.valcode.model.entity.Materia;
import com.valcode.model.repository.MateriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
//@CrossOrigin("http://localhost:4200")
public class MateriaController {
	
	private final MateriaRepository repository;
	
    @Autowired
    public MateriaController(MateriaRepository repository){
        this.repository = repository;
    }
    
    @GetMapping
    public List<Materia> getAlll(){
        return this.repository.findAll();
    }

}

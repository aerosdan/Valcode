package com.valcode.rest;

import com.valcode.model.entity.Movimentos;
import com.valcode.model.repository.MovimentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimentos")
//@CrossOrigin("http://localhost:4200")
public class MovimentosController {

    private final MovimentosRepository repository;

    @Autowired
    public MovimentosController(MovimentosRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movimentos save(@RequestBody Movimentos movimentos){
        return this.repository.save(movimentos);
    }

    @GetMapping
    public List<Movimentos> getAll(){
        return this.repository.findAll();
    }
}

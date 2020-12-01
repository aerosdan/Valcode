package com.valcode;
//	
import com.valcode.model.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValcodeApplication {
	@Autowired
	private static PessoaFisicaRepository pessoaFisicaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ValcodeApplication.class, args);
	}
}

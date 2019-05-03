package com.example.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Pessoa;
import com.example.spring.repository.PessoaRepository;

@RestController
public class PessoaResource {

	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoas")
    public List<Pessoa> getAll() {
        return pessoaRepository.findAll();
    }
	
}

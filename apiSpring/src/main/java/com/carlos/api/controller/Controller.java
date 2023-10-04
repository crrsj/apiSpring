package com.carlos.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.api.model.Pessoa;

@RestController
public class Controller {
    @GetMapping("")
	public String mensagem() {
		return "Hello World";
	}
    @GetMapping("/bemvindo/{nome}")
    public String boasVindas(@PathVariable String nome) {
    
    	return "Boas Vindas!" + nome;
    }
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
    
    	return p;
    	
    }
}

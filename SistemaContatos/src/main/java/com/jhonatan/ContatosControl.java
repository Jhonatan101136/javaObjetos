package com.jhonatan;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ContatosControl {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		
		LISTA_CONTATOS.add(new Contato("1", "Maria", "55 88244833"));
		LISTA_CONTATOS.add(new Contato("2", "Mox", "55 88244834"));
		LISTA_CONTATOS.add(new Contato("3", "Augusto", "55 88244835"));
		LISTA_CONTATOS.add(new Contato("4", "Gustavo", "55 88244836"));
		LISTA_CONTATOS.add(new Contato("5", "Jose", "55 88244837"));
		
	}
	

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("Listar");
		
		modelAndView.addObject("contatos",LISTA_CONTATOS);
		
		return modelAndView;
	}
	{
}
}

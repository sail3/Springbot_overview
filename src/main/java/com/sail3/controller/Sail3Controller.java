package com.sail3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sail3.model.Persona;
import com.sail3.repo.IPersonaRepo;

@Controller
public class Sail3Controller {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="world") String name, Model model) {
		
		Persona p = new Persona();
		p.setIdPersona(1);
		p.setNombre(name);
		repo.save(p);
		
		model.addAttribute("name", name);
		return "saludo";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		model.addAttribute("personas", repo.findAll());
		return "listar";
	}
}

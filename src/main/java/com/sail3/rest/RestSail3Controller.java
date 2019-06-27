package com.sail3.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sail3.repo.IPersonaRepo;
import com.sail3.model.Persona;

@RestController
@RequestMapping("/persona")
public class RestSail3Controller {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar() {
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@PutMapping
	public void modificar(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Persona persona) {
		repo.delete(persona);
	}
	
	
}

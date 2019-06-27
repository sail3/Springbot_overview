package com.sail3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sail3.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
}

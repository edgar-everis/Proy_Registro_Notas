package com.main.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.RegistroNotas;

import com.main.serviceimpl.RegistroNotasImpl;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/API/Reporte")
public class RegistroController {

	@Autowired
	private RegistroNotasImpl service;
	
	@GetMapping
	public Flux<RegistroNotas> getall()
	{return service.getAll();}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<RegistroNotas> createStudent(@RequestBody RegistroNotas registro){
	return service.createRegistro(registro);}

	//Actualiza un estudiante
	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<RegistroNotas> updateStudent(@PathVariable String id,@RequestBody RegistroNotas registro){return service.modifyRegistro(id, registro);}

	//Elimina un estudiante
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Mono<Void> deleteStudents(@PathVariable String id) {return service.deleteById(id);}
	
}

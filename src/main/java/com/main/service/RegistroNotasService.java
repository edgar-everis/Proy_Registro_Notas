package com.main.service;


import com.main.model.RegistroNotas;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RegistroNotasService {
	
	Mono<RegistroNotas> createRegistro( RegistroNotas registro);

	Mono<RegistroNotas> modifyRegistro(String id, RegistroNotas registro);

	Mono<Void> deleteById(String id);

	Mono<RegistroNotas> findbyId(String id);
	
	Flux<RegistroNotas> getAll();

}

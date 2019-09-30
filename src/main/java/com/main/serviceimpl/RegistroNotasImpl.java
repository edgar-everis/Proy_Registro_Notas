package com.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.RegistroNotas;
import com.main.repository.RegistroRepository;
import com.main.service.RegistroNotasService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RegistroNotasImpl implements RegistroNotasService {
	
	@Autowired
	private RegistroRepository repo;
	
	@Override
	public Mono<RegistroNotas> createRegistro(RegistroNotas registro) {
		// TODO Auto-generated method stub
		return repo.save(registro);
	}

	@Override
	public Mono<RegistroNotas> modifyRegistro(String id, RegistroNotas registro) {
		// TODO Auto-generated method stub
		registro.setId(id);
		return repo.save(registro);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return repo.deleteById(id);
	}

	@Override
	public Mono<RegistroNotas> findbyId(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Flux<RegistroNotas> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}

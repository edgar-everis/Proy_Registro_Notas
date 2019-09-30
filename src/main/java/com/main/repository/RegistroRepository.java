package com.main.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.main.model.RegistroNotas;

@Repository
public interface RegistroRepository extends ReactiveMongoRepository<RegistroNotas, String>{

}

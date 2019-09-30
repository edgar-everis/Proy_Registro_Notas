package com.main.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "Notas")
public class RegistroNotas {
	
	@Id
	private String id;
	
	private String alumno;
	
	private String curso;
	
	private String profesor;
	
	private String tipo;
	
	private Notas notas;

}

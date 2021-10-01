package com.whnm.springbootrest.model;

import lombok.Builder;
import lombok.Data;


//@XmlRootElement(name="persona")
@Data
@Builder
public class Persona {
	private Integer id;
	private String nombre;
	private Curso curso;
}

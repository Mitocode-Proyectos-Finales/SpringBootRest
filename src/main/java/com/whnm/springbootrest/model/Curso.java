package com.whnm.springbootrest.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Curso {
	private Integer id;
	private String nombre;
}

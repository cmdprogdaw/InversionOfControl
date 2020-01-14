package com.cris.IoC.servicio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ComponenteNombres {

	
	public String[] getNombres() {
		
		String[] nombres = {"Paco", "Juan", "Maria"};
		
		return nombres;
	}
}

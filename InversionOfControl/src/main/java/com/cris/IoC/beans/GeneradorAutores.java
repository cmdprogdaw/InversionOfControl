package com.cris.IoC.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cris.IoC.beans.autor.AutorBean;

@Configuration
public class GeneradorAutores {

	
	@Bean
	@Scope("prototype") //ya no es un singleton, a la hora de inyectar tiene que generar un objeto nuevo con estos datos, pero nuevo
	public AutorBean juan() {
		
		AutorBean autor = new AutorBean();
		autor.setNombre("Juan");
		autor.setEdad(22);
		
		return autor;
	}
	
	@Bean
	public AutorBean maria() {
		
		AutorBean autor = new AutorBean();
		autor.setNombre("Maria");
		autor.setEdad(20);
		
		return autor;
	}
}

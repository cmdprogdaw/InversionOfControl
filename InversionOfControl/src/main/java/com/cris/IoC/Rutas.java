package com.cris.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cris.IoC.beans.autor.AutorBean;
import com.cris.IoC.servicio.ComponenteNombres;

@Controller
public class Rutas {

	@Autowired
	AutorBean juan;
	
	@Autowired
	AutorBean maria;
	
	@Autowired
	@Qualifier("juan")
	AutorBean pedro;
	
	
	@Autowired
	ComponenteNombres componenteNombres;
	
	
	@GetMapping("/")
	@ResponseBody //va a devolver a una pag web el mensaje del return (sin falta de crearla)
	public String rutaInicial() {
		
		String salida = "";
		for(String str: componenteNombres.getNombres()) {
			
			salida += str+"<br>";
		}
		
		return salida;
	}
	
	
	@GetMapping("/singleton1")
	@ResponseBody
	public String rutaSingleton() {
		
		
		return componenteNombres.toString();
	}
}

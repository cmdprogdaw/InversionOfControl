package com.cris.IoC.beans.autor;

public class AutorBean {

	private String nombre;
	private int edad;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {
		return this.hashCode()+" [" + nombre + " " + edad + "]";
	}
	
}

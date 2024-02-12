package com.udemy.persona;

public class Persona {

	// Atributos de la Clase
	public String nombre;
	public String apellido;
	public String genero;
	public String ocupacion;
	
	//Constructor
	public Persona() {		
	}

	//Metodos
	public void desplegarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Genero: " + genero);
		System.out.println("Ocupacion: " + ocupacion + "\n");
	}

}

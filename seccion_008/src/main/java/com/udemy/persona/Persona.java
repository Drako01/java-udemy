package com.udemy.persona;

public class Persona {

	// Atributos de la Clase
	String nombre;
	String apellido;
	String genero;
	String ocupacion;
	
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

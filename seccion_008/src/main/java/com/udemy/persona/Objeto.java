package com.udemy.persona;

public class Objeto {

	public static void main(String[] args) {
		Persona persona1 = new Persona(); //Creo una nueva instancia de Persona
		Persona persona2 = new Persona(); //Creo otra nueva instancia de Persona
		
		
		persona1.nombre = "Alejandro";
		persona1.apellido = "Di Stefano";
		persona1.genero = "M";
		persona1.ocupacion = "Profesor";
		
		persona2.nombre = "Lola";
		persona2.apellido = "Di Stefano";
		persona2.genero = "F";
		persona2.ocupacion = "Alumna";
			
		persona1.desplegarInformacion();
		persona2.desplegarInformacion();
		
		//Imprimimos la ubicacion en Memoria
		System.out.println("Persona 1: " + persona1);
		System.out.println("Persona 2: " + persona2);
		
	}
	
}

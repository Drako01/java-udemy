package com.udemy.pasoporreferencia;

import com.udemy.persona.Persona;

public class PasoPorReferencia {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.nombre = "Alejandro Daniel";
		System.out.println("persona1.nombre = " + persona1.nombre);
		cambiarValor(persona1);
		System.out.println("persona1.nombre Cambiado = " + persona1.nombre);
	}
	
	public static void cambiarValor(Persona persona) {
		persona.nombre = "Alejandro Daniel Di Stefano";
	}

}

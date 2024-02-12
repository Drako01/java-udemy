package com.udemy.returnynull;

import com.udemy.persona.Persona;

public class PasoPorReferencia {
	public static void main(String[] args) {
		//Persona persona1 = new Persona();
		Persona persona1 = null;
		/*persona1.nombre = "Alejandro Daniel";
		System.out.println("persona1.nombre = " + persona1.nombre);*/
		persona1 = cambiarValor(persona1);
		System.out.println("persona1.nombre Cambiado = " + persona1.nombre);
	}
	
	

	public static Persona cambiarValor(Persona persona) {
		if (persona == null) {
			System.out.println("Valor de Persona Invalido= " + null);
			return null;
		}
		persona.nombre = "Alejandro Daniel Di Stefano";
		return persona; // Devuelve la referencia al Objeto en memoria. Ej: 0x03223
	}

}

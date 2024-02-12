package com.udemy.test;

import com.udemy.encapsulamiento.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
	
	Persona persona1 = new Persona("Ale", "Di Stefano", "Profesor", 47, 100000, false);
	persona1.setNombre("Alejandro Daniel");
	
	// Al estar en println llama Automaticamente el metodo toString()
	System.out.println(persona1);

    }

}

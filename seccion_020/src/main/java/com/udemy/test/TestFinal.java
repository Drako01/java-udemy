package com.udemy.test;

import com.udemy.final_.Persona;

public class TestFinal {
    public static void main(String[] args) {
	final int miVariable = 10;
	System.out.println("miVariable = " + miVariable);
	System.out.println("miConstante = " + Persona.MI_CONSTANTE);
	
	//miVariable = 5; //Ya no deja reasignarle un Valor
	
	final Persona persona1 = new Persona();
	//persona1 = new Persona();  No se puede asignar un nuevo objeto a esta variable porque es final
    
	persona1.setNombre("Alejandro");
	System.out.println("persona1.getNombre() = " + persona1.getNombre());
	persona1.setNombre("Alejandro Daniel");
	System.out.println("persona1.getNombre() Cambiado= " + persona1.getNombre());
    }

}

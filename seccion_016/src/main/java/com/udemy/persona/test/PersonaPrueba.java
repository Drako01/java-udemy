package com.udemy.persona.test;

import com.udemy.persona.Persona;

public class PersonaPrueba {
    
    private int contador;

    public static void main(String[] args) {//Aca NO puedo acceder a contador porque Es static
	Persona persona1 = new Persona("Alejandro");

	Persona persona2 = new Persona("Daniel");

	Persona persona3 = new Persona("Di Stefano");

	imprimir(persona1);
	imprimir(persona2);
	imprimir(persona3);

    }

    public static void imprimir(Persona persona) {
	System.out.println("Persona = " + persona);
    }
    
    public int getContador() { //Aca puedo acceder a contador porque no es static
	imprimir(new Persona("Di Stefano"));
	return contador;
    }
}

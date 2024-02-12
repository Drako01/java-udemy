package com.udemy.palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
	Persona persona = new Persona("Alejandro", "Di Stefano");
	System.out.println("Nombre = " + persona.nombre);
	System.out.println("Apellido = " + persona.apellido);
    }

}

class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
	super(); //Llamada al constructor de la clase padre
	this.nombre = nombre;
	this.apellido = apellido;
	System.out.println("Objeto Persona = " + this);
	new Imprimir().imprimir(this);
    }

}

class Imprimir {
    public Imprimir() {
	super();
    }
    
    public void imprimir(Persona persona) {
	System.out.println("Objeto Persona desde Imprimir = " + persona);
	System.out.println("Impresion del Objeto actual {this} = " + this);
	
    }
}
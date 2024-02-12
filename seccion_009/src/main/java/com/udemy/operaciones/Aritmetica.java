package com.udemy.operaciones;

public class Aritmetica {
	// Atributos de la Clase
	int a;
	int b;

	// Metodos
	public void sumar() {
		int resultado = this.a + this.b;
		System.out.println("El resultado es: " + resultado);
	}

	public int sumarConRetorno() {		
		return this.a + this.b;
	}
	
	public int sumarConArgumentos(int a, int b) {
		this.a = a;
		this.b = b;
		return this.sumarConRetorno();
	}
}

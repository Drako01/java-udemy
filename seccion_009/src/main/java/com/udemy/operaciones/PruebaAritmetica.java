package com.udemy.operaciones;

public class PruebaAritmetica {

	public static void main(String[] args) {
		Aritmetica aritmetica1 = new Aritmetica();
		
		aritmetica1.a = 5;
		aritmetica1.b = 20;
		aritmetica1.sumar();
		
		int resultado = aritmetica1.sumarConRetorno();
		
		System.out.println("El Resultado con Retorno es: " + resultado);
		
		resultado = aritmetica1.sumarConArgumentos(12, 8);
		System.out.println("El Resultado con Argumentos es: " + resultado);
	}


}

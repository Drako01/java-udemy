package com.udemy.constructores;

public class PruebaAritmetica {

	public static void main(String[] args) {
		Aritmetica aritmetica1 = new Aritmetica();
		Aritmetica aritmetica2 = new Aritmetica(5, 8);

		
		int resultado = aritmetica1.sumarConArgumentos(12, 8);
		System.out.println("El Resultado con Argumentos es: " + resultado);

		resultado = aritmetica2.sumarConRetorno();
		System.out.println("El Resultado con Retorno es: " + resultado);
		
	}

}

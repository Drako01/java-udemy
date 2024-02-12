package com.udemy;

public class OperadorTernario {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		var resultado1 = (3 > 7) ? "Verdadero" : "Falso";
		System.out.println("Resultado 1: " + resultado1);
		
		var resultado2 = (3 > 1) ? "Verdadero" : "Falso";
		System.out.println("Resultado 2: " + resultado2);
		
		var numero = 8;
		var resultadoPar = (numero % 2 == 0) ? "Número Par" : "Número Impar"; 
		System.out.println("El número " + numero + " es " + resultadoPar );

	}

}

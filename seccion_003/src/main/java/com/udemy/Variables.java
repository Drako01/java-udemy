package com.udemy;

public class Variables {

	public static void main(String[] args) {
		int miVariableEntera = 10;
		System.out.println(miVariableEntera);
		
		miVariableEntera = 5;
		System.out.println(miVariableEntera);
		
		String miVariableCadena = "Hola";
		
		System.out.println(miVariableCadena);
		
		miVariableCadena = "Adios";
		System.out.println(miVariableCadena);
		
		var miEnteroDos = 12;
		System.out.println(miEnteroDos);
		
		var miCadenaDos = "Hola Var";
		System.out.println("miCadenaDos = " + miCadenaDos );
		
		System.out.println("miEnteroDos = " + miEnteroDos);
		
		System.out.println("miCadenaDos = " + miCadenaDos);
		System.out.println("miVariableCadena = " + miVariableCadena);
		
		//Valores Permitidos
		
		var miVariable = 1;
		var _miVariable = 1;
		var $miVariable = 1;
		System.out.println("$miVariable = " + $miVariable);
	}	

}
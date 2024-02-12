package com.udemy;

public class PrecedenciaDeoperadores {

	public static void main(String[] args) {
		var x = 5;
		var y = 10;
		var z = ++x + y--; //Primero se aplica ++x, Luego y-- y finalmente la +
		
		System.out.println("x = " + x); // x = 6
		System.out.println("y = " + y); // y = 9
		System.out.println("z = " + z); // x = 6 & y = 10
		
		var resultado = 4 + 5 * 6 / 3; // Primero se hace * o / y Luego + o -
		System.out.println("resultado = " + resultado);

	}

}

package com.udemy;

public class Concatenaciones {

	public static void main(String[] args) {
		var usuario = "Alejandro";
		var titulo = "Ingeniero";
		var edad = 47;
		var union = titulo + " " +  usuario + " tiene " + edad + " años de Edad.";
		
		System.out.println(union);
		var num1 = 3;
		var num2 = 8;
		//Evalua de Izq a Der
		System.out.println(num1 + num2 + usuario); //Primero Suma y luego concatena
		System.out.println(usuario + num1 + num2); //Concatena todo
		System.out.println(usuario + (num1 + num2)); //Primero Sumael el() y luego concatena
		
		
	}

}

package com.udemy;

import java.util.Scanner;

public class ElMayorDeLosNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Proporciona el Numero 1: ");
		var numero1 = scanner.nextInt();
		System.out.println("Proporciona el Numero 1: ");
		var numero2 = scanner.nextInt();
		
		
		System.out.println(numero1 > numero2 ? "El mayor es: " + numero1 : "El mayor es: " + numero2);
		
		scanner.close();
	}

}

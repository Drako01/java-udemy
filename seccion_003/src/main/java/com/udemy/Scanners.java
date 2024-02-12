package com.udemy;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
		var nombre = "Alejandro";
		
		System.out.println("nombre = " + nombre);
		
		System.out.println("Escribe tu apellido: ");
		Scanner scanner = new Scanner(System.in);
		
		var apellido = scanner.nextLine();
		System.out.println("apellido = " + apellido);
		System.out.println("Nombre completo = " + nombre + " " + apellido);
		scanner.close();
		
	}

}

package com.udemy;

import java.util.Scanner;

public class TareaS4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Proporciona el nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Proporciona el Id: ");
		int id = scanner.nextInt();
		System.out.println("Proporciona el Precio: ");
		float precio = scanner.nextFloat();
		System.out.println("Proporciona el envio gratuito: ");
		boolean envioGratuito = scanner.hasNextBoolean();
		System.out.println(nombre + " #" + id);
		System.out.println("Precio: $" + precio);
		System.out.println("Envio Gratuito: " + envioGratuito);

		scanner.close();

	}

}

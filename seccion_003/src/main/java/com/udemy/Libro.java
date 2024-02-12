package com.udemy;

import java.util.Scanner;

public class Libro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Proporciona el Titulo del Libro");
		var titulo = scanner.nextLine();
		System.out.println("Proporciona el Autor del Libro");
		var autor = scanner.nextLine();

		System.out.println("El Libro " + titulo + " fue escrito por " + autor);
		scanner.close();

	}

}

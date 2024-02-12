package com.udemy;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Proporciona el alto: ");
		int alto = scanner.nextInt();
		
		System.out.println("Proporciona el ancho: ");
		int ancho = scanner.nextInt();
		
		float area;
		float perimetro;
		area = alto * ancho;
		perimetro = (alto + ancho) * 2;
		
		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimetro);
		
		scanner.close();
	}

}

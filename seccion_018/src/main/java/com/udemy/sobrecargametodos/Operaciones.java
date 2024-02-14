package com.udemy.sobrecargametodos;

public class Operaciones {

    public static int sumar(int a, int b) {
	System.out.println("resultado del metodo con int");
	return a + b;
    }

    public static double sumar(double a, double b) {
	System.out.println("resultado del metodo con double");
	return a + b;
    }
}

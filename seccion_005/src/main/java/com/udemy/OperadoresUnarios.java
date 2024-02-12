package com.udemy;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		//Negacion
		var verdad = true;
		System.out.println("verdad = " + verdad);
		System.out.println("verdad negada = " + !verdad);
		
		// Preincremento
		var a = 3;
		var b = ++a;
		System.out.println("Preincrementos: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// Postincremento
		var c = 3;
		var d = c++;
		System.out.println("Postincrementos: ");
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// Predecremento
		var e = 3;
		var f = --e;
		System.out.println("Predecrementos: ");
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		// Postdecremento
		var g = 3;
		var h = g--;
		System.out.println("Postdecrementos: ");
		System.out.println("g = " + g);
		System.out.println("h = " + h);
	}

}

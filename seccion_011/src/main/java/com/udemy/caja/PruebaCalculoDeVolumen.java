package com.udemy.caja;

public class PruebaCalculoDeVolumen {

	public static void main(String[] args) {
		Caja caja = new Caja(3, 2, 6);
		Caja cajaSinArg = new Caja();
		cajaSinArg.alto = 5;
		cajaSinArg.ancho = 10;
		cajaSinArg.profundo = 15;
		
		System.out.println("El volumen de la Caja 1 es: " + caja.calcularVolumen());
		System.out.println("El volumen de la Caja 2 es: " + cajaSinArg.calcularVolumen());
	}

}

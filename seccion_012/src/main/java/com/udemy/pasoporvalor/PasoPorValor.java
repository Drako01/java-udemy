package com.udemy.pasoporvalor;

public class PasoPorValor {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("x = " + x);
		
		cambioValor(x);
		System.out.println("x nuevo valor= " + x);
	}
	
	public static void cambioValor(int arg1) {
		System.out.println("arg1 = " + arg1);
		
		arg1 = 15; // No cambia de valor porque no se puede desde otro metodo 
		
	}
	/*
	  	x = 10
		arg1 = 10
		x nueva = 10
	 */

}

package com.udemy.sobrecargametodos.test;

import com.udemy.sobrecargametodos.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
	var resultado = Operaciones.sumar(1,6);
	System.out.println("resultado = " + resultado);
	
	var resultado2 = Operaciones.sumar(2.3, 6d);
	System.out.println("resultado2 = " + resultado2);
	
	var resultado3 = Operaciones.sumar(3, 6L);
	System.out.println("resultado3 = " + resultado3);

    }

}

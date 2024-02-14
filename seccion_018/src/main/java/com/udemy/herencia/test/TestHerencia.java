package com.udemy.herencia.test;

import java.util.Date;

import com.udemy.herencia.cliente.Cliente;
import com.udemy.herencia.empleado.Empleado;

public class TestHerencia {

    public static void main(String[] args) {
	Empleado empleado1 = new Empleado("Barbara", 5000.0);
	empleado1.setGenero('M');
	empleado1.setEdad(47);
	empleado1.setDireccion("Mi casa 123");

	System.out.println(empleado1);	
	
	var fecha = new Date();
	Cliente cliente1 = new Cliente("Barbara", 'F', 41, "Su casa 123", 
					fecha, true);

	System.out.println(cliente1);
    }

}

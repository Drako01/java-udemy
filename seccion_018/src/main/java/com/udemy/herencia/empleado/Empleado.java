package com.udemy.herencia.empleado;

import com.udemy.herencia.Persona;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado() {	
	this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
	this();	
	this.nombre = nombre;
	this.sueldo = sueldo;
    }
    
    public int getIdEmpleado() {
	return this.idEmpleado;
    }

    public double getSueldo() {
	return this.sueldo;
    }

    public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
    }

    @Override
    public String toString() {
	return "Empleado [idEmpleado=" + this.idEmpleado + "" + ", sueldo=" 
    + this.sueldo + "" + "], \nEmpleado: " + super.toString();
    }

}

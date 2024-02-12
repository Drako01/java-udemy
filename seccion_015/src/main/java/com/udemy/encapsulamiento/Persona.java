package com.udemy.encapsulamiento;

public class Persona {

    private String nombre;
    private String apellido;
    private String ocupacion;
    private int edad;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, String apellido, String ocupacion, int edad, double sueldo, boolean eliminado) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.ocupacion = ocupacion;
	this.edad = edad;
	this.sueldo = sueldo;
	this.eliminado = eliminado;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public String getOcupacion() {
	return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
	this.ocupacion = ocupacion;
    }

    public int getEdad() {
	return edad;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }

    public double getSueldo() {
	return sueldo;
    }

    public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
    }

    public boolean isEliminado() {
	return eliminado;
    }

    public void setEliminado(boolean eliminado) {
	this.eliminado = eliminado;
    }

    @Override
    public String toString() {
	return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido 
		+ ", " + "ocupacion=" + this.ocupacion
		+ ", edad=" + this.edad + ", sueldo=" + this.sueldo + ", eliminado=" 
		+ this.eliminado + "]";
    }

}

package com.udemy.herencia.cliente;

import java.util.Date;

import com.udemy.herencia.Persona;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(String nombre, char genero, int edad, String direccion, 
	    	   Date fechaRegistro, boolean vip) {
	super(nombre, genero, edad, direccion);
	this.idCliente = ++Cliente.contadorCliente;
	this.fechaRegistro = fechaRegistro;
	this.vip = vip;
    }

    public Date getFechaRegistro() {
	return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
	return this.vip;
    }

    public void setVip(boolean vip) {
	this.vip = vip;
    }

    public int getIdCliente() {
	return this.idCliente;
    }

    @Override
    public String toString() {
	return "Cliente [idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro 
		+ ", vip=" + vip + "], \nCliente: " + super.toString();
    }

}

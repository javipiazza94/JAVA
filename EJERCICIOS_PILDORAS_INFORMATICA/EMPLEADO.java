package EJERCICIOS_PILDORAS_INFORMATICA;

import java.util.*;

public class EMPLEADO {
	
	protected String Nombre;
	protected double sueldo;
	protected Date fecha_alta;
	
	
	public EMPLEADO(String nombre, double sueldo, int ano, int mes, int dia) {
		
		this.Nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar fecha_contratacion = new GregorianCalendar (ano, mes-1, dia);
		this.fecha_alta = fecha_contratacion.getTime();
	}


	public String getNombre() {
		return Nombre;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public Date getFecha_alta() {
		return fecha_alta;
	}


	public  void subir_sueldo (double cantidad_porcentaje){
	double aumento = (cantidad_porcentaje/100)*this.sueldo;
	this.sueldo+= aumento;
		
	}
	

}

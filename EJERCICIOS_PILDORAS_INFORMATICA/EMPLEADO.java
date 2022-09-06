package EJERCICIOS_PILDORAS_INFORMATICA;

import java.util.*;

public class EMPLEADO {
	
	protected final String Nombre;
	protected double sueldo;
	protected Date fecha_alta;
	protected String seccion;
	protected int ID;
	private static int ID_Siguiente = 1;
	
	
	public EMPLEADO(String nombre, double sueldo, int ano, int mes, int dia, String seccion) {
		
		this.Nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar fecha_contratacion = new GregorianCalendar (ano, mes-1, dia);
		this.fecha_alta = fecha_contratacion.getTime();
		this.seccion = seccion;	
		this.ID = ID_Siguiente;
		this.ID_Siguiente++;
		}
	
	


	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion2) {
		this.seccion = seccion2;
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

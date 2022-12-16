package EJERCICIOS_PILDORAS_INFORMATICA;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_persona {
	 
	public static void main(String[] args) {
		
		Persona[] arrayPersonas = new Persona[2];
		arrayPersonas[0] = new EMPLEADO2("Rodolfo", 2500, 2011, 3, 8, "Ventas");
		arrayPersonas[1] = new Alumno("Paco", "Informatica");
		
		for (int i = 0; i < arrayPersonas.length; i++) {
			System.out.println(arrayPersonas[i].getNombre()+" "+arrayPersonas[i].DameDescripcion());
		}	
	}

}

abstract class Persona{ //Es abstracta porque contiene un metodo abstracto
	
	private String nombre;
	
	public Persona (String nom) {
		this.nombre=nom;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String DameDescripcion();
	
}

class EMPLEADO2 extends Persona {
	
	public double sueldo;
	public Date fecha_alta;
	public String seccion;
	protected int ID;
	private static int ID_Siguiente = 1;
	
	
	public EMPLEADO2(String nom, double sueldo, int ano, int mes, int dia, String seccion) {
		super(nom);
		
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


	@Override
	public String DameDescripcion() {
		String des = "";
		des = "Este empleado se llama "+getNombre()+" trabaja en la seccion "+ getSeccion()+ " se dio de alta el "+getFecha_alta()+ " y gana "+getSueldo();
		return des;
	}
	
}
	class Alumno extends Persona{

		private String carrera;
		public Alumno(String nom, String carr) {
			super(nom);
			this.carrera = carr;
		}

		public String getCarrera() {
			return carrera;
		}


		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}


		@Override
		public String DameDescripcion() {
			return "Este alumno se llama "+getNombre()+" y estudia la carrera "+getCarrera();
		}
		
	}

package EJERCICIOS_PILDORAS_INFORMATICA;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class uso_empleado {

	public static void main(String[] args) {
		
		Jefatura Jefe_Marketing = new Jefatura("Pepe", 1500, 2013, 5, 4, "Marketing");
		Jefe_Marketing.setIncentivo(2564);
		System.out.println(Jefe_Marketing.getSueldo());
		
		/* EMPLEADO empleado = new EMPLEADO ("Papa Javi", 1200, 2022, 2, 22);
		EMPLEADO empleado2 = new EMPLEADO ("Papa Domin", 1100, 2002, 2, 1);
		
		empleado2.subir_sueldo(30);
		System.out.println("El empleado " +empleado2.getNombre()+ " dado en la alta en la fecha "+empleado2.getFecha_alta()+ " gana "+empleado2.getSueldo()+ " euros");
		
		empleado.subir_sueldo(30);
		System.out.println("El empleado " +empleado.getNombre()+ " dado en la alta en la fecha "+empleado.getFecha_alta()+ " gana "+empleado.getSueldo()+ " euros");
		*/
		
		List<EMPLEADO> Lista = new ArrayList<EMPLEADO>();
		Lista.add(new EMPLEADO ("Papa Javi", 1200, 2017, 4, 7, "RRHH"));
		Lista.add(new EMPLEADO ("Papa Domin", 1100, 2029, 8, 22, "Programacion"));
		Lista.add(new EMPLEADO ("Papa Pepe", 1000, 2020, 1, 18, "Contabilidad"));
		Lista.add(Jefe_Marketing); //Polimorfismo en accion. Principio de sustitucion. Al incluir la jefatura en el empleado se sustituye
		Lista.add(new Jefatura("Papa Ivan", 3500, 2013, 4, 12, "Direccion"));
		
		
		/*for (int i = 0; i<Lista.size(); i++) {
			Lista.get(i).subir_sueldo(55);;
		}
		*/
		for (EMPLEADO E: Lista) {
			E.subir_sueldo(10);		}
		
		/*for  (int i = 0; i<Lista.size(); i++) {
			System.out.println("El empleado " +Lista.get(i).getNombre()+ " dado en la alta en la fecha "+Lista.get(i).getFecha_alta()+ " gana "+Lista.get(i).getSueldo()+ " euros");
		}
		*/
		
		for (int i = 0; i < Lista.size(); i++) {
			if (i<4) {
				System.out.println("El empleado " +Lista.get(i).getNombre()+ " dado en la alta en la fecha "+Lista.get(i).getFecha_alta()+ " gana "+Lista.get(i).getSueldo()+ " euros");
			}
		}
		
		String mensaje = "";
		for (EMPLEADO E: Lista) {
			if (Lista.get(4) != null) {
				Jefatura Jefe_Direccion = (Jefatura)Lista.get(4);
				Jefe_Direccion.setIncentivo(1500);
				mensaje = "El empleado " + Jefe_Direccion.getNombre()+ " dado de alta en la fecha "+Jefe_Direccion.getFecha_alta()+ " cobra " +Jefe_Direccion.getSueldo();
			}
			
		} System.out.println(mensaje);
		
	}
}
	
	class EMPLEADO {
		
		public final String Nombre;
		public double sueldo;
		public Date fecha_alta;
		public String seccion;
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
		
		public EMPLEADO(String name) {
			this.Nombre = name;
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
		
	class Jefatura extends EMPLEADO{
			
			private double incentivo;

			public Jefatura(String name, double wage, int year, int month, int day, String section) {
				super(name, wage, year, month, day, section);
				
			}

			public double getIncentivo() {
				return incentivo;
			}

			public void setIncentivo(double incentivo) {
				this.incentivo = incentivo;
			};
			
			public double getSueldo() { //Si se llama igual que el metodo de la clase padre, se sobreescribe. Para llamar al metodo de la clase padre se usa super.metodo()
				double Sueldo = getIncentivo() + this.sueldo;
				return Sueldo;
			}
		
		}

	
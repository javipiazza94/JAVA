package Ejercicios_basicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class uso_empleado {

	public static void main(String[] args) {
		
		Jefatura Jefe_Marketing = new Jefatura("Pepe", 1500, 2013, 5, 4, "Marketing");
		Jefe_Marketing.setIncentivo(2564);
		Jefe_Marketing.ordenes("Los empleados tendran un mes mas de vacaciones");				
		EMPLEADO Director_comercial= new Jefatura("Fran Corrales", 1234, 2022, 4, 11, "Comercial");
		
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
		Lista.add(Director_comercial);
		
		
		
		/*for (int i = 0; i<Lista.size(); i++) {
			Lista.get(i).subir_sueldo(55);;
		}
		*/
		for (EMPLEADO E: Lista) {
			E.subir_sueldo(10);
			
		}
		
		/*for  (int i = 0; i<Lista.size(); i++) {
			System.out.println("El empleado " +Lista.get(i).getNombre()+ " dado en la alta en la fecha "+Lista.get(i).getFecha_alta()+ " gana "+Lista.get(i).getSueldo()+ " euros");
		}
		*/
		
		for (int i = 0; i < Lista.size(); i++) {
			Collections.sort(Lista); //Para ordenar Listas Array hay que llamar al metodo sort de la clase Collections e incluir por parametro la lista. En la clase que ordena se llama a la interfaz CompareTo y se implementa el metodo
			//Si fuera un array el metodo sort() se efectuaria con la clase Arrays
				System.out.println("El empleado " +Lista.get(i).getNombre()+ " dado en la alta en la fecha "+Lista.get(i).getFecha_alta()+ " gana "+Lista.get(i).getSueldo()+ " euros");
				if (Lista.get(5) != null) {
					Jefatura Jefe_Direccion = (Jefatura)Lista.get(5);
					Jefe_Direccion.setIncentivo(1500);
				}
			} 
	}
}
	
	class EMPLEADO implements Comparable<EMPLEADO>, trabajadores {
		
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

		@Override
		public int compareTo(EMPLEADO otroEmpleado) {
			
			return Double.compare(this.sueldo, otroEmpleado.sueldo);
		}

		@Override
		public String toString() {
			return "EMPLEADO [Nombre=" + Nombre + ", sueldo=" + sueldo + ", fecha_alta=" + fecha_alta + ", seccion="
					+ seccion + ", ID=" + ID + "]";
		}

		@Override
		public double establece_bonus(double bonus) {
			return bonus+trabajadores.bonus_base;
		}
		
	}
		
	class Jefatura extends EMPLEADO implements jefes{
			
			private double incentivo;

			public Jefatura(String name, double wage, int year, int month, int day, String section) {
				super(name, wage, year, month, day, section);
				
			}
			
			@Override
			public String ordenes(String orden) {
				return "La orden efectuada es: "+orden;
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

			@Override
			public double establece_bonus(double bonus) {
				double prima = 2000;
				return prima+bonus+trabajadores.bonus_base;
			}
		
		}

	
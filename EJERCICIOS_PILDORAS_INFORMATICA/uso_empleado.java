package EJERCICIOS_PILDORAS_INFORMATICA;

import java.util.*;


public class uso_empleado {

	public static void main(String[] args) {
		
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
		
		/*for (int i = 0; i<Lista.size(); i++) {
			Lista.get(i).subir_sueldo(55);;
		}
		*/
		for (EMPLEADO E: Lista) {
			E.setSueldo(1750);
		}
		
		/*for  (int i = 0; i<Lista.size(); i++) {
			System.out.println("El empleado " +Lista.get(i).getNombre()+ " dado en la alta en la fecha "+Lista.get(i).getFecha_alta()+ " gana "+Lista.get(i).getSueldo()+ " euros");
		}
		*/
		for (EMPLEADO E: Lista) {
			System.out.println("El empleado " +E.getNombre()+ " dado en la alta en la fecha "+E.getFecha_alta()+ " gana "+E.getSueldo()+ " euros");
		}
	}
	
}
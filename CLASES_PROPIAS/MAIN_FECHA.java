package CLASES_PROPIAS;

import java.util.*;

public class MAIN_FECHA {

	public static void main(String[] args) {
		// PROGRAMA DE MODIFICAR FECHA
		
		Scanner sc = new Scanner(System.in);
		int dia, mes, año;
		boolean continuar = false;
		String respuesta;
		
		do {
		
		System.out.println("Introduce el dia");
		dia = sc.nextInt();
		System.out.println("Introduce el mes");
		mes = sc.nextInt();
		System.out.println("Introduce el año");
		año = sc.nextInt();
		
		FECHA fecha1 = new FECHA (dia, mes, año);
		
		fecha1.decremento();
		System.out.println(fecha1);		
		
		System.out.println("¿Quieres continuar?");
		respuesta = sc.next();
		if (respuesta.equalsIgnoreCase("No")){
			continuar = true;
		}

		}while (!continuar);

}}

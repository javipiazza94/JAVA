package CLASES_PROPIAS;

import java.util.Scanner;

public class MAIN_LINEA {

	public static void main(String[] args) {
		// PROGRAMA DE DESPLAZAMIENTO DE LA LINEA
		
		LINEA linea1 = new LINEA ();
		System.out.println("La linea 1 es "+linea1);
		linea1.mov_abajo(12);
		System.out.println("El desplazamiento es "+linea1+ "\n");
		
		
		LINEA linea2 = new LINEA (new PUNTO (2,2), new PUNTO (1,1));
		System.out.println("La linea 2 es "+linea2);
		linea2.mov_arriba(45);
		System.out.println("El desplazamiento es "+linea2+ "\n");
		
		
		LINEA linea3 = new LINEA (12, 45, 78, 45);
		System.out.println("La linea 3 es "+linea3);
		linea3.mov_derecha(50);
		System.out.println("El desplazamiento es "+linea3);
		linea3.mov_izquierda(50);
		System.out.println("El desplazamiento es "+linea3+ "\n");
		

		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2;
		boolean continuar = false;
		String respuesta;
		
		do {
		
		System.out.println("Introduce la x1");
		x1 = sc.nextInt();
		System.out.println("Introduce la y1");
		y1 = sc.nextInt();
		System.out.println("Introduce la x2");
		x2 = sc.nextInt();
		System.out.println("Introduce la y2");
		y2 = sc.nextInt();
		
		
		
		PUNTO P1 = new PUNTO (x1, y1);
		PUNTO P2 = new PUNTO (x2, y2);
		LINEA linea4 = new LINEA (P1, P2);
		
		linea4.mov_abajo(55);
		System.out.println(linea4);
		
		System.out.println("¿Quieres continuar?");
		respuesta = sc.next();
		if (respuesta.equalsIgnoreCase("No")){
			continuar = true;
		}

		}while (!continuar);

	}
	
		

	}

